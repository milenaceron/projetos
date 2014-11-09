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
public class Tela01 extends javax.swing.JFrame {

    /**
     * Creates new form Tela01
     */
    public Tela01() {
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

        jl_logoflip = new javax.swing.JLabel();
        jl_titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jb_logocmn = new javax.swing.JLabel();
        jb_revista01 = new javax.swing.JButton();
        jb_revista02 = new javax.swing.JButton();
        jb_revista03 = new javax.swing.JButton();
        jb_revista04 = new javax.swing.JButton();
        jb_revista08 = new javax.swing.JButton();
        jb_revista07 = new javax.swing.JButton();
        jb_revista06 = new javax.swing.JButton();
        jb_revista05 = new javax.swing.JButton();
        jb_login = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jl_fundoamarelo = new javax.swing.JLabel();

        setAutoRequestFocus(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_logoflip.setForeground(new java.awt.Color(249, 171, 24));
        jl_logoflip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/logo-revisteiro.png"))); // NOI18N
        getContentPane().add(jl_logoflip, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jl_titulo.setBackground(new java.awt.Color(204, 204, 204));
        jl_titulo.setFont(new java.awt.Font("Hiragino Kaku Gothic ProN", 0, 36)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(204, 204, 204));
        jl_titulo.setText("REVISTEIRO DIGITAL");
        jl_titulo.setPreferredSize(new java.awt.Dimension(100, 50));
        getContentPane().add(jl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 410, 50));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 101, 630, 10));

        jb_logocmn.setForeground(new java.awt.Color(249, 171, 24));
        jb_logocmn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/logo-cmn.png"))); // NOI18N
        getContentPane().add(jb_logocmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 622, -1, 50));

        jb_revista01.setBackground(new java.awt.Color(0, 0, 0));
        jb_revista01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/revista1.png"))); // NOI18N
        jb_revista01.setBorderPainted(false);
        jb_revista01.setContentAreaFilled(false);
        jb_revista01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_revista01ActionPerformed(evt);
            }
        });
        getContentPane().add(jb_revista01, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 145, 146, 209));

        jb_revista02.setBackground(new java.awt.Color(0, 0, 0));
        jb_revista02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/revista2.png"))); // NOI18N
        jb_revista02.setBorderPainted(false);
        jb_revista02.setContentAreaFilled(false);
        jb_revista02.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jb_revista02ComponentMoved(evt);
            }
        });
        jb_revista02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_revista02ActionPerformed(evt);
            }
        });
        getContentPane().add(jb_revista02, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 145, 146, 209));

        jb_revista03.setBackground(new java.awt.Color(0, 0, 0));
        jb_revista03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/revista3.png"))); // NOI18N
        jb_revista03.setBorderPainted(false);
        jb_revista03.setContentAreaFilled(false);
        jb_revista03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_revista03ActionPerformed(evt);
            }
        });
        getContentPane().add(jb_revista03, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 145, 146, 209));

        jb_revista04.setBackground(new java.awt.Color(0, 0, 0));
        jb_revista04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/revista4.png"))); // NOI18N
        jb_revista04.setBorderPainted(false);
        jb_revista04.setContentAreaFilled(false);
        jb_revista04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_revista04ActionPerformed(evt);
            }
        });
        getContentPane().add(jb_revista04, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 145, 146, 209));

        jb_revista08.setBackground(new java.awt.Color(0, 0, 0));
        jb_revista08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/revista8.png"))); // NOI18N
        jb_revista08.setBorderPainted(false);
        jb_revista08.setContentAreaFilled(false);
        jb_revista08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_revista08ActionPerformed(evt);
            }
        });
        getContentPane().add(jb_revista08, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 370, 146, 209));

        jb_revista07.setBackground(new java.awt.Color(0, 0, 0));
        jb_revista07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/revista7.png"))); // NOI18N
        jb_revista07.setBorderPainted(false);
        jb_revista07.setContentAreaFilled(false);
        jb_revista07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_revista07ActionPerformed(evt);
            }
        });
        getContentPane().add(jb_revista07, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 370, 146, 209));

        jb_revista06.setBackground(new java.awt.Color(0, 0, 0));
        jb_revista06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/revista6.png"))); // NOI18N
        jb_revista06.setBorderPainted(false);
        jb_revista06.setContentAreaFilled(false);
        jb_revista06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_revista06ActionPerformed(evt);
            }
        });
        getContentPane().add(jb_revista06, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 370, 146, 209));

        jb_revista05.setBackground(new java.awt.Color(0, 0, 0));
        jb_revista05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/revista5.png"))); // NOI18N
        jb_revista05.setBorderPainted(false);
        jb_revista05.setContentAreaFilled(false);
        jb_revista05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_revista05ActionPerformed(evt);
            }
        });
        getContentPane().add(jb_revista05, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 146, 209));

        jb_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/botao_admin.png"))); // NOI18N
        jb_login.setBorderPainted(false);
        jb_login.setContentAreaFilled(false);
        jb_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_loginActionPerformed(evt);
            }
        });
        getContentPane().add(jb_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 30, -1, -1));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 700));

        jl_fundoamarelo.setBackground(new java.awt.Color(235, 196, 13));
        jl_fundoamarelo.setOpaque(true);
        getContentPane().add(jl_fundoamarelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 880, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_revista01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_revista01ActionPerformed
        // TODO add your handling code here:
        new Tela02().setVisible(true);
    }//GEN-LAST:event_jb_revista01ActionPerformed

    private void jb_revista02ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jb_revista02ComponentMoved
        // TODO add your handling code here:
        new Tela02().setVisible(true);
    }//GEN-LAST:event_jb_revista02ComponentMoved

    private void jb_revista02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_revista02ActionPerformed
        // TODO add your handling code here:
        new Tela02().setVisible(true);
    }//GEN-LAST:event_jb_revista02ActionPerformed

    private void jb_revista03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_revista03ActionPerformed
        // TODO add your handling code here:
        new Tela02().setVisible(true);
    }//GEN-LAST:event_jb_revista03ActionPerformed

    private void jb_revista04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_revista04ActionPerformed

        new Tela02().setVisible(true);

    }//GEN-LAST:event_jb_revista04ActionPerformed

    private void jb_revista08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_revista08ActionPerformed
        // TODO add your handling code here:
        new Tela02().setVisible(true);
    }//GEN-LAST:event_jb_revista08ActionPerformed

    private void jb_revista07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_revista07ActionPerformed
        // TODO add your handling code here:
        new Tela02().setVisible(true);
    }//GEN-LAST:event_jb_revista07ActionPerformed

    private void jb_revista06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_revista06ActionPerformed
        // TODO add your handling code here:
        new Tela02().setVisible(true);
    }//GEN-LAST:event_jb_revista06ActionPerformed

    private void jb_revista05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_revista05ActionPerformed
        // TODO add your handling code here:
        new Tela02().setVisible(true);
    }//GEN-LAST:event_jb_revista05ActionPerformed

    private void jb_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_loginActionPerformed
        // TODO add your handling code here:
        new Tela07().setVisible(true);
    }//GEN-LAST:event_jb_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_login;
    private javax.swing.JLabel jb_logocmn;
    private javax.swing.JButton jb_revista01;
    private javax.swing.JButton jb_revista02;
    private javax.swing.JButton jb_revista03;
    private javax.swing.JButton jb_revista04;
    private javax.swing.JButton jb_revista05;
    private javax.swing.JButton jb_revista06;
    private javax.swing.JButton jb_revista07;
    private javax.swing.JButton jb_revista08;
    private javax.swing.JLabel jl_fundoamarelo;
    private javax.swing.JLabel jl_logoflip;
    private javax.swing.JLabel jl_titulo;
    // End of variables declaration//GEN-END:variables
}
