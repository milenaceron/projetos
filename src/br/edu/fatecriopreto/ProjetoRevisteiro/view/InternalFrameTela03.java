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

    ClienteData DAO;

    private Cliente obj;

    /**
     * Creates new form InternalFrameTela02
     */
    public InternalFrameTela03() {
        initComponents();
        try {
            DAO = new ClienteData();
            obj = new Cliente();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jt_nome = new javax.swing.JTextField();
        jt_cnpj = new javax.swing.JTextField();
        jt_telefone = new javax.swing.JTextField();
        jt_endereco = new javax.swing.JTextField();
        jt_cidade = new javax.swing.JTextField();
        jt_uf = new javax.swing.JTextField();
        jt_site = new javax.swing.JTextField();
        jc_revista = new javax.swing.JComboBox();
        jb_voltar = new javax.swing.JButton();
        jl_subtitulo = new javax.swing.JLabel();
        jl_logoflip = new javax.swing.JLabel();
        jl_titulo = new javax.swing.JLabel();
        jl_nome = new javax.swing.JLabel();
        jl_cnpj = new javax.swing.JLabel();
        jl_telefone = new javax.swing.JLabel();
        jl_endereco = new javax.swing.JLabel();
        jl_cidade = new javax.swing.JLabel();
        jl_uf = new javax.swing.JLabel();
        jl_site = new javax.swing.JLabel();
        jl_revista = new javax.swing.JLabel();
        jb_novo = new javax.swing.JButton();
        jb_editar = new javax.swing.JButton();
        jb_deletar = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jb_pesquisa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jl_fundoamarelo = new javax.swing.JLabel();
        jl_fundobranco = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jt_nome.setEnabled(false);
        jt_nome.setNextFocusableComponent(jt_cnpj);
        jt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(jt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 320, 40));

        jt_cnpj.setEnabled(false);
        jt_cnpj.setNextFocusableComponent(jt_telefone);
        jt_cnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_cnpjActionPerformed(evt);
            }
        });
        getContentPane().add(jt_cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 320, 40));

        jt_telefone.setEnabled(false);
        jt_telefone.setNextFocusableComponent(jt_endereco);
        jt_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_telefoneActionPerformed(evt);
            }
        });
        getContentPane().add(jt_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 320, 40));

        jt_endereco.setEnabled(false);
        jt_endereco.setNextFocusableComponent(jt_cidade);
        jt_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_enderecoActionPerformed(evt);
            }
        });
        getContentPane().add(jt_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 320, 40));

        jt_cidade.setEnabled(false);
        jt_cidade.setNextFocusableComponent(jt_uf);
        jt_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_cidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jt_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 200, 40));

        jt_uf.setEnabled(false);
        jt_uf.setNextFocusableComponent(jt_site);
        jt_uf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_ufActionPerformed(evt);
            }
        });
        getContentPane().add(jt_uf, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 70, 40));

        jt_site.setEnabled(false);
        jt_site.setNextFocusableComponent(jc_revista);
        jt_site.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_siteActionPerformed(evt);
            }
        });
        getContentPane().add(jt_site, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 320, 40));

        jc_revista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        jc_revista.setEnabled(false);
        jc_revista.setNextFocusableComponent(jt_nome);
        getContentPane().add(jc_revista, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 322, 25));

        jb_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/google/layout/Core_Icons/unstyled/unscaled/ic_action_back.png"))); // NOI18N
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

        jl_nome.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_nome.setForeground(new java.awt.Color(204, 204, 204));
        jl_nome.setText("Nome");
        getContentPane().add(jl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jl_cnpj.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_cnpj.setForeground(new java.awt.Color(204, 204, 204));
        jl_cnpj.setText("Cnpj");
        getContentPane().add(jl_cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));
        jl_cnpj.getAccessibleContext().setAccessibleName("CNPJ");

        jl_telefone.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_telefone.setForeground(new java.awt.Color(204, 204, 204));
        jl_telefone.setText("Fone");
        getContentPane().add(jl_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jl_endereco.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_endereco.setForeground(new java.awt.Color(204, 204, 204));
        jl_endereco.setText("Endereço");
        getContentPane().add(jl_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jl_cidade.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_cidade.setForeground(new java.awt.Color(204, 204, 204));
        jl_cidade.setText("Cidade");
        getContentPane().add(jl_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jl_uf.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_uf.setForeground(new java.awt.Color(204, 204, 204));
        jl_uf.setText("UF");
        getContentPane().add(jl_uf, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 330, -1, -1));

        jl_site.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_site.setForeground(new java.awt.Color(204, 204, 204));
        jl_site.setText("Site");
        getContentPane().add(jl_site, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 364, -1, -1));

        jl_revista.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jl_revista.setForeground(new java.awt.Color(204, 204, 204));
        jl_revista.setText("Revista");
        getContentPane().add(jl_revista, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        jb_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/google/layout/Core_Icons/unstyled/unscaled/ic_action_new.png"))); // NOI18N
        jb_novo.setToolTipText("Novo");
        jb_novo.setBorderPainted(false);
        jb_novo.setContentAreaFilled(false);
        jb_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_novoActionPerformed(evt);
            }
        });
        getContentPane().add(jb_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 450, -1, -1));

        jb_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/google/layout/Core_Icons/unstyled/unscaled/ic_action_edit.png"))); // NOI18N
        jb_editar.setToolTipText("Editar");
        jb_editar.setBorderPainted(false);
        jb_editar.setContentAreaFilled(false);
        jb_editar.setEnabled(false);
        jb_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_editarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, 60));

        jb_deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/google/layout/Core_Icons/unstyled/unscaled/ic_action_delete.png"))); // NOI18N
        jb_deletar.setToolTipText("Apagar");
        jb_deletar.setBorderPainted(false);
        jb_deletar.setContentAreaFilled(false);
        jb_deletar.setEnabled(false);
        jb_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deletarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_deletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, 60));

        jb_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/google/layout/Core_Icons/unstyled/unscaled/ic_action_save.png"))); // NOI18N
        jb_salvar.setToolTipText("Salvar");
        jb_salvar.setBorderPainted(false);
        jb_salvar.setContentAreaFilled(false);
        jb_salvar.setEnabled(false);
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, 60));

        jb_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/google/layout/Core_Icons/unstyled/unscaled/ic_action_cancel.png"))); // NOI18N
        jb_cancelar.setToolTipText("Cancelar");
        jb_cancelar.setBorderPainted(false);
        jb_cancelar.setContentAreaFilled(false);
        jb_cancelar.setEnabled(false);
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, 60));

        jb_pesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/fatecriopreto/ProjetoRevisteiro/google/layout/Core_Icons/unstyled/unscaled/ic_action_search.png"))); // NOI18N
        jb_pesquisa.setToolTipText("Novo");
        jb_pesquisa.setBorderPainted(false);
        jb_pesquisa.setContentAreaFilled(false);
        jb_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(jb_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 101, 560, -1));

        jl_fundoamarelo.setBackground(new java.awt.Color(235, 196, 13));
        jl_fundoamarelo.setOpaque(true);
        getContentPane().add(jl_fundoamarelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 540, 840, 50));

        jl_fundobranco.setBackground(new java.awt.Color(255, 255, 255));
        jl_fundobranco.setOpaque(true);
        getContentPane().add(jl_fundobranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 840, 570));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_nomeActionPerformed

    private void jt_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_enderecoActionPerformed

    private void jb_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editarActionPerformed
        // TODO add your handling code here:

        tratarCampos(true);
        ativarCampos(true);
        jb_novo.setEnabled(false);
        jb_editar.setEnabled(false);
        jb_deletar.setEnabled(false);
        jb_salvar.setEnabled(true);
        jb_cancelar.setEnabled(true);
        jb_pesquisa.setEnabled(false);
    }//GEN-LAST:event_jb_editarActionPerformed

    private void jb_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deletarActionPerformed
        // TODO add your handling code here:

        limparCampos();
        tratarCampos(true);
        jb_novo.setEnabled(true);
        jb_editar.setEnabled(true);
        jb_deletar.setEnabled(true);
        jb_salvar.setEnabled(true);
        jb_cancelar.setEnabled(true);
    }//GEN-LAST:event_jb_deletarActionPerformed

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        // TODO add your handling code here:

        try {
            //validar campos
            if (validarCampos()) {
                if (preencherObjeto()) { //preencher objeto
                    if (DAO.incluir(obj)) { //incluir obj no bd
                        JOptionPane.showMessageDialog(this,
                                "Salvo com sucesso");
                        jb_cancelarActionPerformed(evt);

                        jb_novo.setEnabled(true);
                        jb_deletar.setEnabled(false);
                        jb_editar.setEnabled(false);
                        jb_salvar.setEnabled(false);
                        jb_cancelar.setEnabled(false);

                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar:"
                    + e.getMessage());

            jb_salvar.setEnabled(true);
            jb_cancelar.setEnabled(true);

        }


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
        ativarCampos(true);
        limparCampos();
        tratarCampos(true);
        jb_novo.setEnabled(false);
        jb_editar.setEnabled(false);
        jb_deletar.setEnabled(false);
        jb_salvar.setEnabled(true);
        jb_cancelar.setEnabled(true);


    }//GEN-LAST:event_jb_novoActionPerformed

    private void jt_cnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_cnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_cnpjActionPerformed

    private void jt_ufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_ufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_ufActionPerformed

    private void jt_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_cidadeActionPerformed

    private void jt_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_telefoneActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        // TODO add your handling code here:

        limparCampos();
        ativarCampos(false);
        jb_novo.setEnabled(true);
        jb_editar.setEnabled(false);
        jb_deletar.setEnabled(false);
        jb_salvar.setEnabled(false);
        jb_cancelar.setEnabled(false);
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pesquisaActionPerformed
        // TODO add your handling code here:

        limparCampos();
        ativarPesquisa(true);
        jb_novo.setEnabled(false);
        jb_editar.setEnabled(true);
        jb_deletar.setEnabled(true);
        jb_salvar.setEnabled(true);
        jb_cancelar.setEnabled(true);
    }//GEN-LAST:event_jb_pesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_deletar;
    private javax.swing.JButton jb_editar;
    private javax.swing.JButton jb_novo;
    private javax.swing.JButton jb_pesquisa;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JButton jb_voltar;
    private javax.swing.JComboBox jc_revista;
    private javax.swing.JLabel jl_cidade;
    private javax.swing.JLabel jl_cnpj;
    private javax.swing.JLabel jl_endereco;
    private javax.swing.JLabel jl_fundoamarelo;
    private javax.swing.JLabel jl_fundobranco;
    private javax.swing.JLabel jl_logoflip;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_revista;
    private javax.swing.JLabel jl_site;
    private javax.swing.JLabel jl_subtitulo;
    private javax.swing.JLabel jl_telefone;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JLabel jl_uf;
    private javax.swing.JTextField jt_cidade;
    private javax.swing.JTextField jt_cnpj;
    private javax.swing.JTextField jt_endereco;
    private javax.swing.JTextField jt_nome;
    private javax.swing.JTextField jt_site;
    private javax.swing.JTextField jt_telefone;
    private javax.swing.JTextField jt_uf;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        jt_nome.setText(null);
        jt_cnpj.setText(null);
        jt_telefone.setText(null);
        jt_endereco.setText(null);
        jt_cidade.setText(null);
        jt_uf.setText(null);
        jt_site.setText(null);
        jc_revista.setSelectedIndex(0);

    }

    private void tratarCampos(boolean b) {
        jt_nome.setEditable(b);
        jt_cnpj.setEditable(b);
        jt_telefone.setEditable(b);
        jt_endereco.setEditable(b);
        jt_cidade.setEditable(b);
        jt_uf.setEditable(b);
        jt_site.setEditable(b);
        jc_revista.setEnabled(b);
    }

    private void ativarCampos(boolean b) {
        jt_nome.setEnabled(b);
        jt_cnpj.setEnabled(b);
        jt_telefone.setEnabled(b);
        jt_endereco.setEnabled(b);
        jt_cidade.setEnabled(b);
        jt_uf.setEnabled(b);
        jt_site.setEnabled(b);
        jc_revista.setEnabled(b);

    }

    private void ativarPesquisa(boolean b) {
        jt_cnpj.setEnabled(b);

    }

    private boolean validarCampos() {
        if (jt_nome.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Digite o nome: ");
            jt_nome.requestFocus();
            return false;
        }

        if (jt_cnpj.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Digite o cnpj: ");
            jt_cnpj.requestFocus();
            return false;

        }

        if (jt_telefone.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Digite o contato: ");
            jt_telefone.requestFocus();
            return false;
        }

        if (jt_endereco.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Digite o endereço: ");
            jt_endereco.requestFocus();
            return false;
        }

        if (jt_cidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a cidade: ");
            jt_cidade.requestFocus();
            return false;
        }

        if (jt_uf.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a UF: ");
            jt_uf.requestFocus();
            return false;

        }

        if (jt_site.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Digite o site: ");
            jt_site.requestFocus();
            return false;
        }

//        if (jc_revista.getSelectedIndex() == 0) {
//            
//            JOptionPane.showMessageDialog(this, "Escolha a revista: ");
//            jc_revista.requestFocus();
//            return false;
//            
//        }
        return true;
    }

    private boolean preencherObjeto() throws Exception {
        obj.setNome(jt_nome.getText());
        obj.setCnpj(jt_cnpj.getText());
        obj.setTelefone(jt_telefone.getText());
        obj.setEndereco(jt_endereco.getText());
        obj.setCidade(jt_cidade.getText());
        obj.setUf(jt_uf.getText());
        obj.setSite(jt_site.getText());
        //obj.setRevista(jc_revista.getSelectedItem().toString;
        return true;

    }
}
