/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.fatecriopreto.ProjetoRevisteiro.view;

/**
 *
 * @author raphaelmachadofreire
 */
public class Tela07 extends javax.swing.JFrame {

    /**
     * Creates new form Tela01
     */
    public Tela07() {
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

        jb_logocmn = new javax.swing.JLabel();
        jt_login = new javax.swing.JTextField();
        jp_senha = new javax.swing.JPasswordField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jb_sair = new javax.swing.JButton();
        jb_revista = new javax.swing.JButton();
        jl_fundoamarelo = new javax.swing.JLabel();

        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_logocmn.setForeground(new java.awt.Color(249, 171, 24));
        jb_logocmn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/login-senha-cmn.png"))); // NOI18N
        getContentPane().add(jb_logocmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 120, -1, 390));

        jt_login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jt_login.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_loginActionPerformed(evt);
            }
        });
        getContentPane().add(jt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 290, 55));

        jp_senha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jp_senha.setText("jPasswordField1");
        getContentPane().add(jp_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 290, 55));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jb_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/botao-entrar.png"))); // NOI18N
        jb_sair.setBorderPainted(false);
        jb_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_sairActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jb_sair);
        jb_sair.setBounds(790, 620, 51, 47);

        jb_revista.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jb_revista.setForeground(new java.awt.Color(153, 153, 153));
        jb_revista.setText("Esqueceu a sua senha?");
        jb_revista.setBorderPainted(false);
        jb_revista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_revista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_revistaActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jb_revista);
        jb_revista.setBounds(20, 630, 300, 40);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 700));

        jl_fundoamarelo.setBackground(new java.awt.Color(235, 196, 13));
        jl_fundoamarelo.setOpaque(true);
        getContentPane().add(jl_fundoamarelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 880, 275));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_loginActionPerformed

    private void jb_revistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_revistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_revistaActionPerformed

    private void jb_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_sairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_sairActionPerformed

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
            java.util.logging.Logger.getLogger(Tela07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela07().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jb_logocmn;
    private javax.swing.JButton jb_revista;
    private javax.swing.JButton jb_sair;
    private javax.swing.JLabel jl_fundoamarelo;
    private javax.swing.JPasswordField jp_senha;
    private javax.swing.JTextField jt_login;
    // End of variables declaration//GEN-END:variables
}
