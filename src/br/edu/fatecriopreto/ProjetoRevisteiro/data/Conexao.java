/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecriopreto.ProjetoRevisteiro.data;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author raphaelmachado
 */
public class Conexao {

    private Connection con;

    public Conexao() throws Exception {
        String url = "jdbc:mysql://localhost:3306/revisteiro?zeroDateTimeBehavior=convertToNull";
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, "root", "");
    }

    public Connection getConexao() {
        return con;
    }
}
