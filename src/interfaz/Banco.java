/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author LUCYLEONOR
 */
public class Banco extends javax.swing.JFrame {

    /**
     * Creates new form banco
     */
    public Banco() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblS = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdRestaurar = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Banco");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel2.setText("Monto Ahorrado");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMKeyTyped(evt);
            }
        });
        jPanel2.add(txtM, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 80, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel3.setText("Saldo Final");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        lblS.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 120, 40));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        cmdRestaurar.setText("Restaurar");
        cmdRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRestaurarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed

        if (txtM.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Ingresó El Monto Ahorrado", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtM.requestFocusInWindow();
        } else if (txtM.getText().equalsIgnoreCase("0")) {
            JOptionPane.showMessageDialog(this, "Ingrese Un Monto Superior a 0", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtM.selectAll();
            txtM.requestFocusInWindow();
        } else {
            String r;
            double m, t, d;

            m = Double.parseDouble(txtM.getText());

            d = m * 0.015;

            t = m - d;

            r = String.valueOf(t);

            lblS.setText("$ " + r);
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRestaurarActionPerformed

        txtM.setText("");
        lblS.setText("");
        txtM.requestFocusInWindow();
    }//GEN-LAST:event_cmdRestaurarActionPerformed

    private void txtMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (txtM.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ingresó El Monto Ahorrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtM.requestFocusInWindow();
            } else if (txtM.getText().equalsIgnoreCase("0")) {
                JOptionPane.showMessageDialog(this, "Ingrese Un Monto Superior a 0", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtM.selectAll();
                txtM.requestFocusInWindow();
            } else {
                String r;
                double m, t, d;

                m = Double.parseDouble(txtM.getText());

                d = m * 0.015;

                t = m - d;

                r = String.valueOf(t);

                lblS.setText("$ " + r);
            }
        }
    }//GEN-LAST:event_txtMKeyPressed

    private void txtMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtMKeyTyped

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
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdRestaurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblS;
    private javax.swing.JTextField txtM;
    // End of variables declaration//GEN-END:variables
}
