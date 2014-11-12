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
public class Cliente extends Pessoa {

    private String cnpj;
    private String endereco;
    private String site;
    private String revista;

    public Cliente() {

        super();

        cnpj = "";
        endereco = "";
        site = "";
        revista = "";

    }

    public Cliente(int id, String nome, String cidade, String uf, String telefone, String email,
            String cnpj, String endereco, String site, String revista) {

        super(id, nome, cidade, uf, telefone, email);
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.site = site;
        this.revista = revista;

    }

    @Override
    public void lerDados() {
        super.lerDados();

        cnpj = JOptionPane.showInputDialog("Digite o cnpj: ");
        endereco = JOptionPane.showInputDialog("Digite o endereço: ");
        site = JOptionPane.showInputDialog("Digite o site: ");
        revista = JOptionPane.showInputDialog("Digite a revista: ");

    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSite() {
        return site;
    }
    
    public void setRevista(String revista){
        this.revista = revista;
    }
    
    public String getRevista(){
        return revista;
    }

}
