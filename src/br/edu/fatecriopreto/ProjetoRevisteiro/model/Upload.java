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
public class Upload {

    private String nomearquivo;
    private String urlarquivo;

    public Upload() {

        nomearquivo = "";
        urlarquivo = "";

    }

    public Upload(String nomearquivo, String urlarquivo) {

        this.nomearquivo = nomearquivo;
        this.urlarquivo = urlarquivo;

    }

    public void lerDados() {

        nomearquivo = JOptionPane.showInputDialog("Digite o nome do arquivo: ");
        urlarquivo = JOptionPane.showInputDialog("Digite a url do arquivo: ");

    }

    public void setNomearquivo(String nomearquivo) {
        this.nomearquivo = nomearquivo;
    }

    public String getNomearquivo() {
        return nomearquivo;
    }

    public void setUrlarquivo(String urlarquivo) {
        this.urlarquivo = urlarquivo;
    }

    public String getUrlarquivo() {
        return urlarquivo;
    }
}
