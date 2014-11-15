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
public class Tela08 extends javax.swing.JFrame {

    /**
     * Creates new form Tela01
     */
    public Tela08() {
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

        jdpTelaDashboard = new javax.swing.JDesktopPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jl_logoflip = new javax.swing.JLabel();
        jl_titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jl_subtitulo = new javax.swing.JLabel();
        jb_usuario = new javax.swing.JButton();
        jb_midia = new javax.swing.JButton();
        jb_cliente = new javax.swing.JButton();
        jb_revista = new javax.swing.JButton();
        jb_logocmn = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jl_fundobranco = new javax.swing.JLabel();
        jl_imagem_fundo = new javax.swing.JLabel();
        jb_sair = new javax.swing.JButton();
        jl_fundobranco1 = new javax.swing.JLabel();
        jl_fundoamarelo = new javax.swing.JLabel();

        setAutoRequestFocus(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdpTelaDashboard.setBackground(new java.awt.Color(255, 196, 0));
        jdpTelaDashboard.setEnabled(false);
        jdpTelaDashboard.setOpaque(false);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        javax.swing.GroupLayout jdpTelaDashboardLayout = new javax.swing.GroupLayout(jdpTelaDashboard);
        jdpTelaDashboard.setLayout(jdpTelaDashboardLayout);
        jdpTelaDashboardLayout.setHorizontalGroup(
            jdpTelaDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(jdpTelaDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jdpTelaDashboardLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jdpTelaDashboardLayout.setVerticalGroup(
            jdpTelaDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(jdpTelaDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jdpTelaDashboardLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jdpTelaDashboard.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jdpTelaDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 101, 653, 10));

        jl_subtitulo.setBackground(new java.awt.Color(204, 204, 204));
        jl_subtitulo.setFont(new java.awt.Font("Myriad Pro", 1, 30)); // NOI18N
        jl_subtitulo.setForeground(new java.awt.Color(204, 204, 204));
        jl_subtitulo.setText("Dashboard");
        jl_subtitulo.setPreferredSize(new java.awt.Dimension(100, 50));
        getContentPane().add(jl_subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 410, 50));

        jb_usuario.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jb_usuario.setForeground(new java.awt.Color(153, 153, 153));
        jb_usuario.setText("Usuário");
        jb_usuario.setBorderPainted(false);
        jb_usuario.setContentAreaFilled(false);
        jb_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jb_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 248, -1, -1));

        jb_midia.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jb_midia.setForeground(new java.awt.Color(153, 153, 153));
        jb_midia.setText("Mídia");
        jb_midia.setBorderPainted(false);
        jb_midia.setContentAreaFilled(false);
        jb_midia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_midia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_midiaActionPerformed(evt);
            }
        });
        getContentPane().add(jb_midia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 289, -1, 30));

        jb_cliente.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jb_cliente.setForeground(new java.awt.Color(153, 153, 153));
        jb_cliente.setBorderPainted(false);
        jb_cliente.setContentAreaFilled(false);
        jb_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_cliente.setLabel("Cliente");
        jb_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(jb_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 324, -1, -1));

        jb_revista.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jb_revista.setForeground(new java.awt.Color(153, 153, 153));
        jb_revista.setText("Revista");
        jb_revista.setBorderPainted(false);
        jb_revista.setContentAreaFilled(false);
        jb_revista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jb_revista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_revistaActionPerformed(evt);
            }
        });
        getContentPane().add(jb_revista, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jb_logocmn.setForeground(new java.awt.Color(249, 171, 24));
        jb_logocmn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/logo-cmn.png"))); // NOI18N
        getContentPane().add(jb_logocmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 622, -1, 50));

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jl_fundobranco.setBackground(new java.awt.Color(255, 255, 255));
        jl_fundobranco.setOpaque(true);
        jLayeredPane2.add(jl_fundobranco);
        jl_fundobranco.setBounds(0, 0, 0, 0);

        jl_imagem_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/imagem-dashboard.png"))); // NOI18N
        jLayeredPane2.add(jl_imagem_fundo);
        jl_imagem_fundo.setBounds(213, 170, 650, 420);

        jb_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/botao-sair-preto.png"))); // NOI18N
        jb_sair.setBorderPainted(false);
        jb_sair.setContentAreaFilled(false);
        jb_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_sairActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jb_sair);
        jb_sair.setBounds(808, 625, 51, 47);

        getContentPane().add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 700));

        jl_fundobranco1.setBackground(new java.awt.Color(255, 255, 255));
        jl_fundobranco1.setOpaque(true);
        getContentPane().add(jl_fundobranco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 600));

        jl_fundoamarelo.setBackground(new java.awt.Color(235, 196, 13));
        jl_fundoamarelo.setOpaque(true);
        getContentPane().add(jl_fundoamarelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 880, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_usuarioActionPerformed
        // TODO add your handling code here:
        criarJanelaInternalFrameTela06();
    }//GEN-LAST:event_jb_usuarioActionPerformed

    private void jb_revistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_revistaActionPerformed
        // TODO add your handling code here:
        criarJanelaInternalFrameTela04();
    }//GEN-LAST:event_jb_revistaActionPerformed

    private void jb_midiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_midiaActionPerformed
        // TODO add your handling code here:
        criarJanelaInternalFrameTela05();
    }//GEN-LAST:event_jb_midiaActionPerformed

    private void jb_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_sairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jb_sairActionPerformed

    private void jb_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_clienteActionPerformed
        // TODO add your handling code here:
        criarJanelaInternalFrameTela03();
    }//GEN-LAST:event_jb_clienteActionPerformed

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
            java.util.logging.Logger.getLogger(Tela08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela08().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_cliente;
    private javax.swing.JLabel jb_logocmn;
    private javax.swing.JButton jb_midia;
    private javax.swing.JButton jb_revista;
    private javax.swing.JButton jb_sair;
    private javax.swing.JButton jb_usuario;
    private javax.swing.JDesktopPane jdpTelaDashboard;
    private javax.swing.JLabel jl_fundoamarelo;
    private javax.swing.JLabel jl_fundobranco;
    private javax.swing.JLabel jl_fundobranco1;
    private javax.swing.JLabel jl_imagem_fundo;
    private javax.swing.JLabel jl_logoflip;
    private javax.swing.JLabel jl_subtitulo;
    private javax.swing.JLabel jl_titulo;
    // End of variables declaration//GEN-END:variables

InternalFrameTela03 internalFrameTela03;
InternalFrameTela04 internalFrameTela04;
InternalFrameTela05 internalFrameTela05;
InternalFrameTela06 internalFrameTela06;
    
    private void criarJanelaInternalFrameTela03() {
        if(internalFrameTela03 == null){
        internalFrameTela03 = new InternalFrameTela03();
        }
        jdpTelaDashboard.add(internalFrameTela03);
        internalFrameTela03.setVisible(true);
       
    }
    
    private void criarJanelaInternalFrameTela04() {
        if(internalFrameTela04 == null){
        internalFrameTela04 = new InternalFrameTela04();
        }
        jdpTelaDashboard.add(internalFrameTela04);
        internalFrameTela04.setVisible(true);
       
    }
    
     private void criarJanelaInternalFrameTela05() {
        if(internalFrameTela05 == null){
        internalFrameTela05 = new InternalFrameTela05();
        }
        jdpTelaDashboard.add(internalFrameTela05);
        internalFrameTela05.setVisible(true);
       
    }
     
      private void criarJanelaInternalFrameTela06() {
        if(internalFrameTela06 == null){
        internalFrameTela06 = new InternalFrameTela06();
        }
        jdpTelaDashboard.add(internalFrameTela06);
        internalFrameTela06.setVisible(true);
       
    }
      
   

}
