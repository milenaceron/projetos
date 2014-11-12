/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecriopreto.ProjetoRevisteiro.data;

import javax.swing.JOptionPane;

/**
 *
 * @author raphaelmachado
 */
public class TestaConexao {

    public static void main(String[] args) {
        try {
            Conexao con = new Conexao();
            JOptionPane.showConfirmDialog(null, "Servidor conectado com sucesso");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

}
