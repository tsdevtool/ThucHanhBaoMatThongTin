/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN6_NGUYENTHANHSIEU;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Administrator
 */
public class Server {

    private static final int PORT = 12345;

    public interface MessageListener {
        void onMessageReceived(String encryptedMessage, String decryptedMessage);
    }

    private MessageListener messageListener;

    public void setMessageListener(MessageListener listener) {
        this.messageListener = listener;
    }

    public void startServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server is running...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Thỏa thuận khóa chung sử dụng Diffie-Hellman
            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("DiffieHellman");
            keyPairGen.initialize(1024);
            KeyPair serverKeyPair = keyPairGen.generateKeyPair();
            KeyAgreement serverKeyAgreement = KeyAgreement.getInstance("DiffieHellman");
            serverKeyAgreement.init(serverKeyPair.getPrivate());

            // Gửi public key cho client
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(serverKeyPair.getPublic().getEncoded());

            // Nhận public key từ client
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            byte[] clientPublicKeyBytes = (byte[]) in.readObject();

            KeyFactory keyFactory = KeyFactory.getInstance("DiffieHellman");
            X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(clientPublicKeyBytes);
            PublicKey clientPublicKey = keyFactory.generatePublic(x509KeySpec);

            serverKeyAgreement.doPhase(clientPublicKey, true);

            // Tính toán khóa chung
            byte[] sharedSecret = serverKeyAgreement.generateSecret();
            SecretKeySpec secretKeySpec = new SecretKeySpec(sharedSecret, 0, 16, "AES");

            // Nhận và giải mã văn bản
            byte[] encryptedBytes = (byte[]) in.readObject();
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            String encryptedMessage = new String(encryptedBytes);
            String decryptedMessage = new String(cipher.doFinal(encryptedBytes));

            System.out.println("Received message from client: " + encryptedMessage);
            System.out.println("Decrypted message from client: " + decryptedMessage);

            if (messageListener != null) {
                messageListener.onMessageReceived(encryptedMessage, decryptedMessage);
            }

            // Đóng kết nối
            socket.close();
            serverSocket.close();
        } catch (IOException | NoSuchAlgorithmException | InvalidKeyException | ClassNotFoundException |
                 NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
    
}
