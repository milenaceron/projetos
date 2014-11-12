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
public class Pessoa {

    private int id;
    private String nome;
    private String cidade;
    private String uf;
    private String telefone;
    private String email;

    public Pessoa() {

        id = 0;
        nome = "";
        cidade = "";
        uf = "";
        telefone = "";
        email = "";

    }

    public Pessoa(int id, String nome, String cidade, String uf, String telefone, String email) {

        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.uf = uf;
        this.telefone = telefone;
        this.email = email;

    }

    public void lerDados() {

        nome = JOptionPane.showInputDialog("Digite o nome: ");
        cidade = JOptionPane.showInputDialog("Digite a cidade: ");
        uf = JOptionPane.showInputDialog("Digite a UF: ");
        telefone = JOptionPane.showInputDialog("Digite o telefone: ");
        email = JOptionPane.showInputDialog("Digite o e-mail: ");

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getUf() {
        return uf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
