/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN1_NguyenThanhSieu;

/**
 *
 * @author Administrator
 */
public class PlayFail extends javax.swing.JFrame {

    /**
     * Creates new form PlayFail
     */
    char pf[][] = {
        {'M','O','N','A','R'},
        {'C','H','Y','B','D'},
        {'E','F','G','I','K'},
        {'L','P','Q','S','T'},
        {'U','V','W','X','Z'},
    };
    public PlayFail() {
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

        btnMaHoa = new javax.swing.JButton();
        btnGiaiMa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbm = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtk = new javax.swing.JTextField();
        txtbr = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMaHoa.setText("Ma hoa");
        btnMaHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaHoaActionPerformed(evt);
            }
        });

        btnGiaiMa.setText("Giai ma");
        btnGiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaiMaActionPerformed(evt);
            }
        });

        txtbm.setColumns(20);
        txtbm.setRows(5);
        jScrollPane1.setViewportView(txtbm);

        jLabel3.setText("Ban ma:");

        jLabel2.setText("Khoa:");

        txtk.setEditable(false);
        txtk.setText("MONARCHY");

        jLabel1.setText("Ban ro: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbr))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtk, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMaHoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnGiaiMa)
                                .addGap(24, 24, 24)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGiaiMa)
                    .addComponent(btnMaHoa))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaHoaActionPerformed
        String banro = this.txtbr.getText();
        banro = banro.toUpperCase();
        banro = banro.replace('J', 'I');
        String banma = mahoa(banro);
        this.txtbm.setText(banma);
    }//GEN-LAST:event_btnMaHoaActionPerformed

    private void btnGiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaiMaActionPerformed
        // TODO add your handling code here:
        String banma = this.txtbm.getText();
        String banro = giaima(banma);
        int n = banro.length();
        String br = "";
        for(int i = 0; i<n-2; i+=2){
            if(banro.charAt(i) == banro.charAt(i+2))
                br += banro.charAt(i);
            else    br+= banro.charAt(i) + "" + banro.charAt(i+1);
            
        }
        if(banro.charAt(n-1) == 'X')
            br+=banro.charAt(n-2);
        else br+=banro.charAt(n-2); br+=banro.charAt(n-1);
        
        this.txtbr.setText(br);
        
    }//GEN-LAST:event_btnGiaiMaActionPerformed

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
            java.util.logging.Logger.getLogger(PlayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayFail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiaiMa;
    private javax.swing.JButton btnMaHoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtbm;
    private javax.swing.JTextField txtbr;
    private javax.swing.JTextField txtk;
    // End of variables declaration//GEN-END:variables

    private String timViTri(char a){
        for(int i = 0; i<a; i++)
            for(int j = 0; j<5; j++)
                if(pf[i][j] == a)
                    return i + "" + j;
        return "";
    }
    
    String thayThe(char a, char b){
        String vta = timViTri(a);
        String vtb = timViTri(b);
        
        char x,y;
        if(vta.charAt(0) == vtb.charAt(0)){
            x = pf[vta.charAt(0) - '0'][((vta.charAt(1) - '0') + 1)%5];
            y = pf[(vtb.charAt(0) - '0')][((vtb.charAt(1) - '0') + 1)%5];
            return x+""+y;
        }
        if(vta.charAt(1) == vtb.charAt(1)){
            x = pf[((vta.charAt(0) - '0')+1)%5][(vta.charAt(1) - '0')];
            y = pf[((vtb.charAt(0) - '0')+1)%5][(vtb.charAt(1) - '0')];
            return x+""+y;
        }
        x = pf[(vta.charAt(0) - '0')][(vta.charAt(1) - '0')];
        y = pf[(vtb.charAt(0) - '0')][(vtb.charAt(1) - '0')];
        return x+""+y;
        
    }
    private String mahoa(String banro) {
        int n = banro.length();
        int i = 0;
        String banma="";
        char a,b;
        while(i<n){
            if(i == n-1){
                a = banro.charAt(i);
                b = 'X';
                i++;
            }else{
                a = banro.charAt(i);
                b = banro.charAt(i+1);
                
                if(a == b ){
                    b = 'X';
                    i++;
                }else   i+=2;
            }
            banma+=thayThe(a,b);
        }
        return banma;
    }

    private String giaima(String banma) {
        int n = banma.length();
        String banro = "";
        char a,b;
        for(int i = 0; i < n ; i+=2){
            a = banma.charAt(i);
            b = banma.charAt(i+1);
            
            banro+=thayTheNguoc(a,b);
        }
        return banro;
    }
    
    String thayTheNguoc(char a, char b){
        String vta = timViTri(a);
        String vtb = timViTri(b);
        
        char x,y;
        if(vta.charAt(0) == vtb.charAt(0)){
            x = pf[vta.charAt(0) - '0'][((vta.charAt(1) - '0') - 1+5)%5 ];
            y = pf[vtb.charAt(0) - '0'][((vtb.charAt(1) - '0') - 1+5)%5 ];
            return x+""+y;
        }
        
        if(vta.charAt(1) == vtb.charAt(1)){
            x = pf[((vta.charAt(0) - '0')-1 +5)%5][(vta.charAt(1) - '0')];
            y = pf[((vtb.charAt(0) - '0')-1 + 5)%5][(vtb.charAt(1) - '0')];
            return x+""+y;
        }
        
        x = pf[(vta.charAt(0) - '0')][(vta.charAt(1) - '0')];
        y = pf[(vtb.charAt(0) - '0')][(vtb.charAt(1) - '0')];
        return x+""+y;
    }
}