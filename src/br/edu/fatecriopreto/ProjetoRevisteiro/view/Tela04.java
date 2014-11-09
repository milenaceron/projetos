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
public class Tela04 extends javax.swing.JFrame {

    /**
     * Creates new form Tela01
     */
    public Tela04() {
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
        jl_subtitulo = new javax.swing.JLabel();
        jb_usuario = new javax.swing.JButton();
        jb_midia = new javax.swing.JButton();
        jb_cliente = new javax.swing.JButton();
        jb_revista = new javax.swing.JButton();
        jl_nome = new javax.swing.JLabel();
        jt_nome = new javax.swing.JTextField();
        jl_cliente = new javax.swing.JLabel();
        jc_cliente = new javax.swing.JComboBox();
        jl_edicao = new javax.swing.JLabel();
        jt_edicao = new javax.swing.JTextField();
        jl_data = new javax.swing.JLabel();
        jt_data = new javax.swing.JTextField();
        jl_imagem = new javax.swing.JLabel();
        jc_imagem = new javax.swing.JComboBox();
        jl_categoria = new javax.swing.JLabel();
        jt_categoria = new javax.swing.JTextField();
        jl_url = new javax.swing.JLabel();
        jt_url = new javax.swing.JTextField();
        jl_descricao = new javax.swing.JLabel();
        jt_descricao = new javax.swing.JTextField();
        jb_novo = new javax.swing.JButton();
        jb_editar = new javax.swing.JButton();
        jb_deletar = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jb_sair = new javax.swing.JButton();
        jb_logocmn = new javax.swing.JLabel();
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

        jl_subtitulo.setBackground(new java.awt.Color(204, 204, 204));
        jl_subtitulo.setFont(new java.awt.Font("Myriad Pro", 1, 30)); // NOI18N
        jl_subtitulo.setForeground(new java.awt.Color(204, 204, 204));
        jl_subtitulo.setText("cadastro de revista");
        jl_subtitulo.setPreferredSize(new java.awt.Dimension(100, 50));
        getContentPane().add(jl_subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 125, 410, 50));

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
        getContentPane().add(jb_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 323, -1, -1));

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

        jl_nome.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_nome.setForeground(new java.awt.Color(204, 204, 204));
        jl_nome.setText("Nome");
        getContentPane().add(jl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 245, -1, -1));

        jt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(jt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 236, 320, 40));

        jl_cliente.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_cliente.setForeground(new java.awt.Color(204, 204, 204));
        jl_cliente.setText("Cliente");
        getContentPane().add(jl_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 278, -1, -1));

        jc_cliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jc_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 274, 322, 25));
        jc_cliente.getAccessibleContext().setAccessibleDescription("");

        jl_edicao.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_edicao.setForeground(new java.awt.Color(204, 204, 204));
        jl_edicao.setText("Edição");
        getContentPane().add(jl_edicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jt_edicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_edicaoActionPerformed(evt);
            }
        });
        getContentPane().add(jt_edicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 298, 90, 40));

        jl_data.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_data.setForeground(new java.awt.Color(204, 204, 204));
        jl_data.setText("Data");
        getContentPane().add(jl_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 307, -1, -1));

        jt_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_dataActionPerformed(evt);
            }
        });
        getContentPane().add(jt_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 298, 130, 40));

        jl_imagem.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_imagem.setForeground(new java.awt.Color(204, 204, 204));
        jl_imagem.setText("Imagem");
        getContentPane().add(jl_imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        jc_imagem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jc_imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 336, 322, 25));

        jl_categoria.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_categoria.setForeground(new java.awt.Color(204, 204, 204));
        jl_categoria.setText("Categoria");
        getContentPane().add(jl_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 372, -1, -1));

        jt_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_categoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 320, 40));

        jl_url.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_url.setForeground(new java.awt.Color(204, 204, 204));
        jl_url.setText("Url");
        getContentPane().add(jl_url, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 407, -1, -1));

        jt_url.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_urlActionPerformed(evt);
            }
        });
        getContentPane().add(jt_url, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 397, 320, 40));

        jl_descricao.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_descricao.setForeground(new java.awt.Color(204, 204, 204));
        jl_descricao.setText("Descrição");
        getContentPane().add(jl_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        jt_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_descricaoActionPerformed(evt);
            }
        });
        getContentPane().add(jt_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 434, 320, 40));

        jb_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/botao-novo.png"))); // NOI18N
        jb_novo.setBorderPainted(false);
        jb_novo.setContentAreaFilled(false);
        getContentPane().add(jb_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 490, -1, -1));

        jb_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/botao-editar.png"))); // NOI18N
        jb_editar.setBorderPainted(false);
        jb_editar.setContentAreaFilled(false);
        jb_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_editarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 490, -1, 60));

        jb_deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/botao-deletar.png"))); // NOI18N
        jb_deletar.setBorderPainted(false);
        jb_deletar.setContentAreaFilled(false);
        jb_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deletarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_deletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 489, -1, 60));

        jb_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/botao-salvar.png"))); // NOI18N
        jb_salvar.setBorderPainted(false);
        jb_salvar.setContentAreaFilled(false);
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 490, -1, 60));

        jb_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/botao-sair.png"))); // NOI18N
        jb_sair.setBorderPainted(false);
        jb_sair.setContentAreaFilled(false);
        getContentPane().add(jb_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, -1, -1));

        jb_logocmn.setForeground(new java.awt.Color(249, 171, 24));
        jb_logocmn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/logo-cmn.png"))); // NOI18N
        getContentPane().add(jb_logocmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 622, -1, 50));

        jl_fundoamarelo.setBackground(new java.awt.Color(235, 196, 13));
        jl_fundoamarelo.setOpaque(true);
        getContentPane().add(jl_fundoamarelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 880, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_editarActionPerformed

    private void jb_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_deletarActionPerformed

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_usuarioActionPerformed

    private void jb_revistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_revistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_revistaActionPerformed

    private void jb_midiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_midiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_midiaActionPerformed

    private void jt_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_dataActionPerformed

    private void jt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_nomeActionPerformed

    private void jt_edicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_edicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_edicaoActionPerformed

    private void jt_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_categoriaActionPerformed

    private void jt_urlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_urlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_urlActionPerformed

    private void jt_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_descricaoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_cliente;
    private javax.swing.JButton jb_deletar;
    private javax.swing.JButton jb_editar;
    private javax.swing.JLabel jb_logocmn;
    private javax.swing.JButton jb_midia;
    private javax.swing.JButton jb_novo;
    private javax.swing.JButton jb_revista;
    private javax.swing.JButton jb_sair;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JButton jb_usuario;
    private javax.swing.JComboBox jc_cliente;
    private javax.swing.JComboBox jc_imagem;
    private javax.swing.JLabel jl_categoria;
    private javax.swing.JLabel jl_cliente;
    private javax.swing.JLabel jl_data;
    private javax.swing.JLabel jl_descricao;
    private javax.swing.JLabel jl_edicao;
    private javax.swing.JLabel jl_fundoamarelo;
    private javax.swing.JLabel jl_imagem;
    private javax.swing.JLabel jl_logoflip;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_subtitulo;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JLabel jl_url;
    private javax.swing.JTextField jt_categoria;
    private javax.swing.JTextField jt_data;
    private javax.swing.JTextField jt_descricao;
    private javax.swing.JTextField jt_edicao;
    private javax.swing.JTextField jt_nome;
    private javax.swing.JTextField jt_url;
    // End of variables declaration//GEN-END:variables
}
