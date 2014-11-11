/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecriopreto.ProjetoRevisteiro.model;

import javax.swing.JOptionPane;

/**
 *
 * @author raphaelmachado
 */
public class Usuario extends Pessoa {

    private String cpf;
    private String login;
    private String senha;
    private String confsenha;

    public Usuario() {

        super();

        cpf = "";
        login = "";
        senha = "";
        confsenha = "";

    }

    public Usuario(int id, String nome, String cidade, String uf, String telefone,
            String email, String cpf, String login, String senha, String confsenha) {

        super(id, nome, cidade, uf, telefone, email);
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.confsenha = confsenha;

    }

    @Override
    public void lerDados() {

        super.lerDados();
        cpf = JOptionPane.showInputDialog("Digite o cpf: ");
        login = JOptionPane.showInputDialog("Digite o login: ");
        senha = JOptionPane.showInputDialog("Digite a senha: ");
        confsenha = JOptionPane.showInputDialog("Digite a confirmação da senha: ");

    }

}
