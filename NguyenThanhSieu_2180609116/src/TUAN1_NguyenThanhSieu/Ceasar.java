/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN1_NguyenThanhSieu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Ceasar extends javax.swing.JFrame {

    /**
     * Creates new form Ceasar
     */
    public Ceasar() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtvanban = new javax.swing.JTextArea();
        txtkhoa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmahoa = new javax.swing.JTextArea();
        btnmahoa = new javax.swing.JButton();
        btnghifile = new javax.swing.JButton();
        btngiaima = new javax.swing.JButton();
        btnmofile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CHƯƠNG TRÌNH MÃ HOÁ CEASAR");

        jLabel2.setText("PlainText");

        jLabel3.setText("Khoá");

        jLabel4.setText("CipherText");

        txtvanban.setColumns(20);
        txtvanban.setRows(5);
        jScrollPane1.setViewportView(txtvanban);

        txtkhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkhoaActionPerformed(evt);
            }
        });

        txtmahoa.setColumns(20);
        txtmahoa.setRows(5);
        jScrollPane2.setViewportView(txtmahoa);

        btnmahoa.setText("v Encypt v");
        btnmahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmahoaActionPerformed(evt);
            }
        });

        btnghifile.setText("Ghi File");
        btnghifile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnghifileActionPerformed(evt);
            }
        });

        btngiaima.setText("^ Dencrypt ^");
        btngiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngiaimaActionPerformed(evt);
            }
        });

        btnmofile.setText("Mở file");
        btnmofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmofileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnmahoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnghifile)
                                .addGap(30, 30, 30))
                            .addComponent(jScrollPane1)
                            .addComponent(txtkhoa)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btngiaima)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnmofile)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(80, 80, 80))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmahoa)
                    .addComponent(btnghifile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btngiaima)
                    .addComponent(btnmofile))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkhoaActionPerformed

    private void btnmahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmahoaActionPerformed
        // TODO add your handling code here:
        //btn ma hoa
        
        try{
            int k = Integer.valueOf(this.txtkhoa.getText());
            String br = this.txtvanban.getText();
            this.txtmahoa.setText(mahoa(br,k));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Yêu cầu nhập thông tin đúng");
        }
    }//GEN-LAST:event_btnmahoaActionPerformed

    private void btngiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngiaimaActionPerformed
        // TODO add your handling code here:
        //BTN giai ma
        try{
            int k = Integer.valueOf(this.txtkhoa.getText());
            String br  = this.txtmahoa.getText();
            this.txtvanban.setText(mahoa(br,-k));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Kiểm tra xem bạn đã nhập khoá để giải mã chưa");
        }
    }//GEN-LAST:event_btngiaimaActionPerformed

    private void btnghifileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnghifileActionPerformed
        // btn ghi file
        try{
            BufferedWriter bw= null;
            String fileName = "M:\\Dulieu.txt";
            String s = txtmahoa.getText();
            
            bw =  new BufferedWriter(new FileWriter(fileName));
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null, "Đã ghi file thành công !!");
        }catch(IOException ex){
            Logger.getLogger(Ceasar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnghifileActionPerformed

    private void btnmofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmofileActionPerformed
        // btn mo file
        try{
            BufferedReader br =  null;
            String fileName = "M:\\Dulieu.txt";
            br = new BufferedReader(new FileReader(fileName));
            StringBuffer sb = new StringBuffer();
            JOptionPane.showMessageDialog(null, "Mở file thành công!!!");
            char[] ca = new char[5];
            while(br.ready()){
                int len = br.read(ca);
                sb.append(ca,0,len);
            }
            br.close();
            
            System.out.println("Du Lieu la: " + sb);
            String chuoi = sb.toString();
            
            txtvanban.setText(chuoi);
        }catch(IOException ex){
            Logger.getLogger(Ceasar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmofileActionPerformed

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
            java.util.logging.Logger.getLogger(Ceasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ceasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ceasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ceasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ceasar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnghifile;
    private javax.swing.JButton btngiaima;
    private javax.swing.JButton btnmahoa;
    private javax.swing.JButton btnmofile;
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

    private char mahoakt(char c, int k){
        if(!Character.isLetter(c))  return c;
        return (char) ((((Character.toUpperCase(c) - 'A') + k ) %26 + 26) %26 + 'A');
    }
    private String mahoa(String br, int k) {
        String kq = "";
        int n = br.length();
        for(int i = 0; i<n; i++)
            kq += mahoakt(br.charAt(i), k);
        return kq;
    }
}