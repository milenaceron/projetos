/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecriopreto.ProjetoRevisteiro.view;

import br.edu.fatecriopreto.ProjetoRevisteiro.model.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author raphaelmachado
 */
public class InternalFrameTela03 extends javax.swing.JInternalFrame {

    private Cliente obj;

    /**
     * Creates new form InternalFrameTela02
     */
    public InternalFrameTela03() {
        initComponents();
        obj = new Cliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela021 = new br.edu.fatecriopreto.ProjetoRevisteiro.view.Tela02();
        jl_voltar = new javax.swing.JLabel();
        jb_voltar = new javax.swing.JButton();
        jl_subtitulo = new javax.swing.JLabel();
        jl_logoflip = new javax.swing.JLabel();
        jl_titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jl_nome = new javax.swing.JLabel();
        jt_nome = new javax.swing.JTextField();
        jt_contato = new javax.swing.JTextField();
        jl_contato = new javax.swing.JLabel();
        jt_endereco = new javax.swing.JTextField();
        jl_endereco = new javax.swing.JLabel();
        jc_revista = new javax.swing.JComboBox();
        jl_revista = new javax.swing.JLabel();
        jb_novo = new javax.swing.JButton();
        jb_editar = new javax.swing.JButton();
        jb_deletar = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jt_site = new javax.swing.JTextField();
        jl_site = new javax.swing.JLabel();
        jl_fundoamarelo = new javax.swing.JLabel();
        jl_fundobranco = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_voltar.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jl_voltar.setForeground(new java.awt.Color(153, 153, 153));
        jl_voltar.setText("voltar");
        getContentPane().add(jl_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jb_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/botao-voltar.png"))); // NOI18N
        jb_voltar.setBorderPainted(false);
        jb_voltar.setContentAreaFilled(false);
        jb_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jl_subtitulo.setBackground(new java.awt.Color(204, 204, 204));
        jl_subtitulo.setFont(new java.awt.Font("Myriad Pro", 1, 30)); // NOI18N
        jl_subtitulo.setForeground(new java.awt.Color(204, 204, 204));
        jl_subtitulo.setText("cadastro de cliente");
        jl_subtitulo.setPreferredSize(new java.awt.Dimension(100, 50));
        getContentPane().add(jl_subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 410, 50));

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
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 101, 560, -1));

        jl_nome.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_nome.setForeground(new java.awt.Color(204, 204, 204));
        jl_nome.setText("Nome");
        getContentPane().add(jl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(jt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 320, 40));

        jt_contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_contatoActionPerformed(evt);
            }
        });
        getContentPane().add(jt_contato, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 320, 40));

        jl_contato.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_contato.setForeground(new java.awt.Color(204, 204, 204));
        jl_contato.setText("Contato");
        getContentPane().add(jl_contato, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jt_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_enderecoActionPerformed(evt);
            }
        });
        getContentPane().add(jt_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 320, 40));

        jl_endereco.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_endereco.setForeground(new java.awt.Color(204, 204, 204));
        jl_endereco.setText("Endereço");
        getContentPane().add(jl_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jc_revista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jc_revista, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 322, 25));

        jl_revista.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_revista.setForeground(new java.awt.Color(204, 204, 204));
        jl_revista.setText("Revista");
        getContentPane().add(jl_revista, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jb_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/botao-novo.png"))); // NOI18N
        jb_novo.setBorderPainted(false);
        jb_novo.setContentAreaFilled(false);
        jb_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_novoActionPerformed(evt);
            }
        });
        getContentPane().add(jb_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jb_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/botao-editar.png"))); // NOI18N
        jb_editar.setBorderPainted(false);
        jb_editar.setContentAreaFilled(false);
        jb_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_editarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, 60));

        jb_deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/botao-deletar.png"))); // NOI18N
        jb_deletar.setBorderPainted(false);
        jb_deletar.setContentAreaFilled(false);
        jb_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deletarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_deletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, 60));

        jb_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/img/botao-salvar.png"))); // NOI18N
        jb_salvar.setBorderPainted(false);
        jb_salvar.setContentAreaFilled(false);
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, 60));

        jt_site.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_siteActionPerformed(evt);
            }
        });
        getContentPane().add(jt_site, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 279, 320, 40));

        jl_site.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_site.setForeground(new java.awt.Color(204, 204, 204));
        jl_site.setText("Site");
        getContentPane().add(jl_site, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 285, -1, -1));

        jl_fundoamarelo.setBackground(new java.awt.Color(235, 196, 13));
        jl_fundoamarelo.setOpaque(true);
        getContentPane().add(jl_fundoamarelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 495, 810, 15));

        jl_fundobranco.setBackground(new java.awt.Color(255, 255, 255));
        jl_fundobranco.setOpaque(true);
        getContentPane().add(jl_fundobranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_nomeActionPerformed

    private void jt_contatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_contatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_contatoActionPerformed

    private void jt_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_enderecoActionPerformed

    private void jb_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_editarActionPerformed

    private void jb_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_deletarActionPerformed

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_voltarActionPerformed
        // TODO add your handling code jl_site
        this.dispose();
    }//GEN-LAST:event_jb_voltarActionPerformed

    private void jt_siteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_siteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_siteActionPerformed

    private void jb_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novoActionPerformed
        // TODO add your handling code here:

        limparCampos();
        tratarCampos(true);
        jb_deletar.setEnabled(false);
        jb_editar.setEnabled(false);
        jb_salvar.setEnabled(true);

    }//GEN-LAST:event_jb_novoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_deletar;
    private javax.swing.JButton jb_editar;
    private javax.swing.JButton jb_novo;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JButton jb_voltar;
    private javax.swing.JComboBox jc_revista;
    private javax.swing.JLabel jl_contato;
    private javax.swing.JLabel jl_endereco;
    private javax.swing.JLabel jl_fundoamarelo;
    private javax.swing.JLabel jl_fundobranco;
    private javax.swing.JLabel jl_logoflip;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_revista;
    private javax.swing.JLabel jl_site;
    private javax.swing.JLabel jl_subtitulo;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JLabel jl_voltar;
    private javax.swing.JTextField jt_contato;
    private javax.swing.JTextField jt_endereco;
    private javax.swing.JTextField jt_nome;
    private javax.swing.JTextField jt_site;
    private br.edu.fatecriopreto.ProjetoRevisteiro.view.Tela02 tela021;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        jt_nome.setText(null);
        jt_contato.setText(null);
        jt_endereco.setText(null);
        jt_site.setText(null);
        //   jc_revista  perguntar para professora
    }

    private void tratarCampos(boolean b) {
        jt_nome.setEditable(b);
        jt_contato.setEditable(b);
        jt_endereco.setEditable(b);
        jt_site.setEditable(b);
    }

    private boolean validarCampos() {
        if (jt_nome.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Digite o nome: ");
            jt_nome.requestFocus();
            return false;
        }

        if (jt_contato.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Digite o contato: ");
            jt_contato.requestFocus();
            return false;
        }

        if (jt_endereco.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Digite o endereço: ");
            jt_endereco.requestFocus();
            return false;
        }

        if (jt_site.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Digite o site: ");
            jt_site.requestFocus();
            return false;
        }
        return true;
    }

    private boolean preencherObjeto() throws Exception {
        obj.setNome(jt_nome.getText());
        obj.setContato(jt_contato.getText());
        obj.setEndereco(jt_endereco.getText());
        obj.setSite(jt_site.getText());
        return true;

    }
}
