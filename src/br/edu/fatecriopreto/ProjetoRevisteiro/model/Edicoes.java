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
public class Edicoes {

    private int id;
    private int numero;
    private String dataedicao;

    public Edicoes() {

        id = 0;
        numero = 0;
        dataedicao = "";

    }

    public Edicoes(int id, int numero, String dataedicao) {

        this.id = id;
        this.numero = numero;
        this.dataedicao = dataedicao;

    }

    public void lerDados() {

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da edição: "));
        dataedicao = JOptionPane.showInputDialog("Digite a data da edição: ");

    }

}
