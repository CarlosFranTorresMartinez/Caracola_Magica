/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Random;

/**
 *
 * @author CarlosTM
 */
public class Caracola extends javax.swing.JFrame {

    /**
     * Creates new form Caracola
     */
    public Caracola() {
        initComponents();
        setLocationRelativeTo(null);
    }

    Random random = new Random();

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
        txtPregunta = new javax.swing.JTextField();
        btnTirarCuerda = new javax.swing.JButton();
        lblRptCaracola = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caracola Magica");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 220));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Preguntale a la Caracola Mágica");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        txtPregunta.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        getContentPane().add(txtPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 170, -1));

        btnTirarCuerda.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        btnTirarCuerda.setText("Responder");
        btnTirarCuerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTirarCuerdaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTirarCuerda, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 200, -1));

        lblRptCaracola.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        getContentPane().add(lblRptCaracola, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 200, 30));

        jLabel3.setText("¿");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 10, 20));

        jLabel4.setText(" ?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 20, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTirarCuerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTirarCuerdaActionPerformed
        for (int i = 0; i < 1; i++) {
            int randomInteger = random.nextInt(4) + 1;
            switch (randomInteger) {
                case 1:
                    lblRptCaracola.setText("SI");
                    break;
                case 2:
                    lblRptCaracola.setText("NO");
                    break;
                case 3:
                    lblRptCaracola.setText("TAL VEZ");
                    break;
                case 4:
                    lblRptCaracola.setText("PROBLAMENTE");
                    break;
            }
        }
    }//GEN-LAST:event_btnTirarCuerdaActionPerformed

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
            java.util.logging.Logger.getLogger(Caracola.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caracola.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caracola.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caracola.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caracola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTirarCuerda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblRptCaracola;
    private javax.swing.JTextField txtPregunta;
    // End of variables declaration//GEN-END:variables
}
