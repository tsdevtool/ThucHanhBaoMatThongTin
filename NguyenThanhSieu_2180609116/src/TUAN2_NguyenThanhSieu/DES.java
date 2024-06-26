/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN2_NguyenThanhSieu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.shape.Circle;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class DES extends javax.swing.JFrame {

    

    /**
     * Creates new form DES
     */
    public DES() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnhienthi1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtkhoa = new javax.swing.JTextField();
        btnmahoa = new javax.swing.JButton();
        btnhienthi = new javax.swing.JButton();
        btnghifile = new javax.swing.JButton();
        btngiaima = new javax.swing.JButton();
        btnallshow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtvanban = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmahoa = new javax.swing.JTextArea();

        btnhienthi1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DES");

        jLabel2.setText("Input Key");

        jLabel3.setText("Plaintext");

        jLabel4.setText("CipherText");

        btnmahoa.setText("Mã hoá");
        btnmahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmahoaActionPerformed(evt);
            }
        });

        btnhienthi.setText("Hiển  Thị");
        btnhienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhienthiActionPerformed(evt);
            }
        });

        btnghifile.setText("Ghi File");
        btnghifile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnghifileActionPerformed(evt);
            }
        });

        btngiaima.setText("Giải mã");
        btngiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngiaimaActionPerformed(evt);
            }
        });

        btnallshow.setText("All Show");

        txtvanban.setColumns(20);
        txtvanban.setRows(5);
        jScrollPane1.setViewportView(txtvanban);

        txtmahoa.setColumns(20);
        txtmahoa.setRows(5);
        jScrollPane2.setViewportView(txtmahoa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtkhoa)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnmahoa)
                                        .addGap(30, 30, 30)
                                        .addComponent(btnhienthi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                        .addComponent(btnghifile)
                                        .addGap(13, 13, 13))
                                    .addComponent(jScrollPane1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btngiaima)
                                        .addGap(77, 77, 77)
                                        .addComponent(btnallshow)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmahoa)
                    .addComponent(btnhienthi)
                    .addComponent(btnghifile))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btngiaima)
                    .addComponent(btnallshow))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmahoaActionPerformed
        // TODO add your handling code here:
        try{
            String key = txtkhoa.getText();
            FileInputStream fis = new FileInputStream("M:\\Des.txt");
            FileOutputStream fos = new FileOutputStream("M:\\EnDes.txt");
            
            encrypt(key, fis, fos);
            
            JOptionPane.showMessageDialog(null, "Đã mã hoá văn bản");
        }catch(Throwable e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnmahoaActionPerformed

    private void btngiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngiaimaActionPerformed
        // TODO add your handling code here:
        FileInputStream fis2 = null;
        try{
            String key = txtkhoa.getText();
            fis2 = new FileInputStream("M:\\EnDes.txt");
            FileOutputStream fos2 = new FileOutputStream("M:\\DeDes.txt");
            decrypt(key, fis2, fos2);
            BufferedReader br = null;
            br = new BufferedReader(new FileReader("M:\\DeDes.txt"));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "Đã giải mã");
            char[] ca = new char[5];
            while(br.ready()){
                int len = br.read(ca);
                sb.append(ca,0,len);
            }
            br.close();
            System.out.println("Du lieu la : " + sb);
            String chuoi = sb.toString();
            txtmahoa.setText(chuoi);
        }catch(Throwable ex){
            Logger.getLogger(DES.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                fis2.close();
            }catch(IOException ex){
                Logger.getLogger(DES.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btngiaimaActionPerformed

    private void btnghifileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnghifileActionPerformed
        // TODO add your handling code here:
        try{
            BufferedWriter bw = null;
            String fileName = "M:\\Des.txt";
            String s = txtvanban.getText();
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null, "Đã ghi file");
            txtmahoa.setText(s);
        }catch(IOException ex){
            Logger.getLogger(DES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnghifileActionPerformed

    private void btnhienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhienthiActionPerformed
        // TODO add your handling code here:
        try{
            BufferedReader br = null;
            String fileName = "M:\\EnDes.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "Đã mở file");
            char[] ca = new char[5];
            while(br.ready()){
                int len = br.read(ca);
                sb.append(ca,0,len);
            }
            
            br.close();
            System.out.println("Du lieu la: " + sb);
            String chuoi = sb.toString();
            txtvanban.setText(chuoi);
        }catch(IOException ex){
            Logger.getLogger(DES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnhienthiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DES().setVisible(true);
            }
        });
    }
    
    
    private int mode;
    private static void doCopy(InputStream is, OutputStream os) throws IOException{
        byte[] bytes = new byte[64];
        int numBytes;
        while((numBytes = is.read(bytes))!=-1){
            os.write(bytes,0,numBytes);
        }
        
        os.flush();
        os.close();
        is.close();
    }
    
    public static void encrypt(String key, InputStream is, OutputStream os) throws Throwable{
        encryptOrDecrypt(key, Cipher.ENCRYPT_MODE, is, os);
    }
    public static void decrypt(String key, InputStream is, OutputStream os) throws Throwable{
        encryptOrDecrypt(key, Cipher.DECRYPT_MODE, is, os);
    }
    private static void encryptOrDecrypt(String key, int mode, InputStream is, OutputStream os) throws Throwable{
        DESKeySpec dks = new DESKeySpec(key.getBytes());
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        SecretKey desKey = skf.generateSecret(dks);
        Cipher cipher = Cipher.getInstance("DES");
        
        if(mode == Cipher.ENCRYPT_MODE){
            cipher.init(Cipher.ENCRYPT_MODE, desKey);
            CipherInputStream cis = new CipherInputStream(is, cipher);
            doCopy(cis,os);
        }else if(mode == Cipher.DECRYPT_MODE){
            cipher.init(Cipher.DECRYPT_MODE, desKey);
            CipherOutputStream cos = new CipherOutputStream(os, cipher);
            doCopy(is, cos);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnallshow;
    private javax.swing.JButton btnghifile;
    private javax.swing.JButton btngiaima;
    private javax.swing.JButton btnhienthi;
    private javax.swing.JButton btnhienthi1;
    private javax.swing.JButton btnmahoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtkhoa;
    private javax.swing.JTextArea txtmahoa;
    private javax.swing.JTextArea txtvanban;
    // End of variables declaration//GEN-END:variables
    
}
