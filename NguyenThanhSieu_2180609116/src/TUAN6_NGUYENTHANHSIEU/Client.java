/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN6_NGUYENTHANHSIEU;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Scanner;
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
public class Client {
//    private static final String SERVER_IP = "localhost";
//    private static final int PORT = 12345;
//
//    public static void main(String[] args) {
//        try {
//            Socket socket = new Socket(SERVER_IP, PORT);
//
//            // Step 2: Thỏa thuận khóa chung sử dụng Diffie-Hellman
//            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("DiffieHellman");
//            keyPairGen.initialize(1024);
//            KeyPair clientKeyPair = keyPairGen.generateKeyPair();
//            KeyAgreement clientKeyAgreement = KeyAgreement.getInstance("DiffieHellman");
//            clientKeyAgreement.init(clientKeyPair.getPrivate());
//
//            // Nhận public key từ server
//            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
//            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
//            byte[] serverPublicKeyBytes = (byte[]) in.readObject();
//
//            KeyFactory keyFactory = KeyFactory.getInstance("DiffieHellman");
//            X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(serverPublicKeyBytes);
//            PublicKey serverPublicKey = keyFactory.generatePublic(x509KeySpec);
//
//            clientKeyAgreement.doPhase(serverPublicKey, true);
//
//            // Gửi public key cho server
//            out.writeObject(clientKeyPair.getPublic().getEncoded());
//
//            // Tính toán khóa chung
//            byte[] sharedSecret = clientKeyAgreement.generateSecret();
//            SecretKeySpec secretKeySpec = new SecretKeySpec(sharedSecret, 0, 16, "AES");
//
//            // Nhập văn bản từ người dùng
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter text: ");
//            String plainText = scanner.nextLine();
//
//            // Mã hoá và gửi văn bản
//            Cipher cipher = Cipher.getInstance("AES");
//            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
//            byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
//            out.writeObject(encryptedBytes);
//
//            // Đóng kết nối
//            socket.close();
//
//        } catch (IOException | NoSuchAlgorithmException | InvalidKeyException | ClassNotFoundException |
//                 NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException | InvalidKeySpecException e) {
//            e.printStackTrace();
//        }
//    }

    private static final int PORT = 12345;
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private SecretKeySpec secretKeySpec;

    public void connect(String serverIp) throws IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException, ClassNotFoundException {
        socket = new Socket(serverIp, PORT);

        // Step 2: Thỏa thuận khóa chung sử dụng Diffie-Hellman
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("DiffieHellman");
        keyPairGen.initialize(1024);
        KeyPair clientKeyPair = keyPairGen.generateKeyPair();
        KeyAgreement clientKeyAgreement = KeyAgreement.getInstance("DiffieHellman");
        clientKeyAgreement.init(clientKeyPair.getPrivate());

        // Nhận public key từ server
        out = new ObjectOutputStream(socket.getOutputStream());
        in = new ObjectInputStream(socket.getInputStream());
        byte[] serverPublicKeyBytes = (byte[]) in.readObject();

        KeyFactory keyFactory = KeyFactory.getInstance("DiffieHellman");
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(serverPublicKeyBytes);
        PublicKey serverPublicKey = keyFactory.generatePublic(x509KeySpec);

        clientKeyAgreement.doPhase(serverPublicKey, true);

        // Gửi public key cho server
        out.writeObject(clientKeyPair.getPublic().getEncoded());

        // Tính toán khóa chung
        byte[] sharedSecret = clientKeyAgreement.generateSecret();
        secretKeySpec = new SecretKeySpec(sharedSecret, 0, 16, "AES");
    }

    public void sendMessage(String message) throws IOException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        // Mã hoá và gửi văn bản
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
        out.writeObject(encryptedBytes);
    }

    public void disconnect() throws IOException {
        socket.close();
    }
   
}
