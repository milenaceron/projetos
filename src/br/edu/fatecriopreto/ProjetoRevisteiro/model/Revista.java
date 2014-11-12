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
public class Revista {

    private int id;
    private String projeto;
    private String nome;
    private String imagem;
    private String url;
    private String descricao;
    private String categoria;

    public Revista() {

        id = 0;
        projeto = "";
        nome = "";
        imagem = "";
        url = "";
        descricao = "";
        categoria = "";

    }

    public Revista(int id, String projeto, String nome, String imagem, String url,
            String descricao, String categoria) {

        this.id = id;
        this.projeto = projeto;
        this.nome = nome;
        this.imagem = imagem;
        this.url = url;
        this.descricao = descricao;
        this.categoria = categoria;

    }

    public void lerDados() {

        projeto = JOptionPane.showInputDialog("Digite o projeto: ");
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        imagem = JOptionPane.showInputDialog("Informe o nome da imagem: ");
        url = JOptionPane.showInputDialog("Informe a url da imagem: ");
        descricao = JOptionPane.showInputDialog("Digite a descricão: ");
        categoria = JOptionPane.showInputDialog("Digite a categoria: ");

    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getImagem() {
        return imagem;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}
