/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN5_NguyenThanhSieu;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;

/**
 *
 * @author Administrator
 */
public class frmBob extends javax.swing.JFrame {

    /**
     * Creates new form frmBob
     */
    public frmBob() {
        initComponents();
    }
    KeyAgreement bobKeyAgree;
    PublicKey alicePubKey;
    SecretKey bobDesKey;
    Cipher cobCipher;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtkhoab = new javax.swing.JTextField();
        txtkhoaa = new javax.swing.JTextField();
        txtkhoachung = new javax.swing.JTextField();
        txtmahoakab = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnkhoab = new javax.swing.JButton();
        btnkhoaa = new javax.swing.JButton();
        btnkhoachung = new javax.swing.JButton();
        btnmahoakab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtkhoab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtkhoaa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtkhoachung.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtmahoakab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jButton1.setText("Mã hoá / Giải mã");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã Hoá KAB:");

        jLabel4.setText("Khoá KAB:");

        jLabel3.setText("Khoá Alice:");

        jLabel2.setText("Khoá Bob:");

        jLabel1.setText("Bob");

        btnkhoab.setText("Tạo Khoá B");
        btnkhoab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoabActionPerformed(evt);
            }
        });

        btnkhoaa.setText("Hiển Thị KA");
        btnkhoaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoaaActionPerformed(evt);
            }
        });

        btnkhoachung.setText("Khoá Chung");
        btnkhoachung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoachungActionPerformed(evt);
            }
        });

        btnmahoakab.setText("Mã Hoá KAB");
        btnmahoakab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmahoakabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtkhoachung, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                    .addComponent(txtkhoaa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtkhoab, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmahoakab))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnkhoab)
                                    .addComponent(btnkhoaa)
                                    .addComponent(btnkhoachung)
                                    .addComponent(btnmahoakab))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtkhoab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkhoab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtkhoaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkhoaa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtkhoachung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkhoachung))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtmahoakab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmahoakab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frmDESCS des = new frmDESCS();
            des.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnkhoabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoabActionPerformed
        // TODO add your handling code here:
        try{
            boolean read = false;
            while(!read){
                try{
                    FileInputStream fis = new FileInputStream("M:\\A.pub");
                fis.close();
                read = true;
                }catch(Exception e){}
            }
            
            FileInputStream fis = new FileInputStream("M:\\A.pub");
            byte[] alicePubKeyEnc = new byte[fis.available()];
            fis.read(alicePubKeyEnc);
            fis.close();
            KeyFactory bobKeyFac = KeyFactory.getInstance("DH");
            X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(alicePubKeyEnc);
            alicePubKey = bobKeyFac.generatePublic(x509KeySpec);
            DHParameterSpec dHParamSpec = ((DHPublicKey) alicePubKey).getParams();
            System.out.println("Generate DH keypair...");
            KeyPairGenerator bobKpairGen = KeyPairGenerator.getInstance("DH");
            bobKpairGen.initialize(dHParamSpec);
            KeyPair bobKpair = bobKpairGen.generateKeyPair();
            System.out.println("Initializing KeyAgreement engine...");
            bobKeyAgree = KeyAgreement.getInstance("DH");
            bobKeyAgree.init(bobKpair.getPrivate());
            byte[] bobPubKeyEnc = bobKpair.getPublic().getEncoded();
            FileOutputStream fos =new FileOutputStream("M:\\B.pub");
            fos.write(bobPubKeyEnc);
            fos.close();
            txtkhoab.setText(bobPubKeyEnc.toString());
        }catch(Exception ex){}
    }//GEN-LAST:event_btnkhoabActionPerformed

    private void btnkhoaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoaaActionPerformed
        // TODO add your handling code here:
        try{
            FileInputStream fis = new FileInputStream("M:\\A.pub");
            byte[] akeyP = new byte[fis.available()];
            fis.read(akeyP);
            fis.close();
            txtkhoaa.setText(akeyP.toString());
        }catch(Exception ex){}
    }//GEN-LAST:event_btnkhoaaActionPerformed

    private void btnkhoachungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoachungActionPerformed
        // TODO add your handling code here:
        try{
            bobKeyAgree.doPhase(alicePubKey, true);
            byte[] bobShareSecret = bobKeyAgree.generateSecret();
            System.out.println("Khoa chung: Shared secret (DEBUG ONLY): " + CryptoUtil.toHexString(bobShareSecret));
            txtkhoachung.setText(CryptoUtil.toHexString(bobShareSecret));
        }catch(Exception ex){}
    }//GEN-LAST:event_btnkhoachungActionPerformed

    private void btnmahoakabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmahoakabActionPerformed
        // TODO add your handling code here:
        try{
            bobKeyAgree.doPhase(alicePubKey, true);
            bobDesKey = bobKeyAgree.generateSecret("DES");
            txtmahoakab.setText(bobDesKey.toString());
            BufferedWriter bw = null;
            String fileName = "M:\\KhoaB.txt";
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(bobDesKey.toString());
            bw.close();
        }catch(Exception ex){}
    }//GEN-LAST:event_btnmahoakabActionPerformed

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
            java.util.logging.Logger.getLogger(frmBob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkhoaa;
    private javax.swing.JButton btnkhoab;
    private javax.swing.JButton btnkhoachung;
    private javax.swing.JButton btnmahoakab;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtkhoaa;
    private javax.swing.JTextField txtkhoab;
    private javax.swing.JTextField txtkhoachung;
    private javax.swing.JTextField txtmahoakab;
    // End of variables declaration//GEN-END:variables
}
