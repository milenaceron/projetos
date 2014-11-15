/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecriopreto.ProjetoRevisteiro.view;

import br.edu.fatecriopreto.ProjetoRevisteiro.data.Conexao;
import br.edu.fatecriopreto.ProjetoRevisteiro.model.Cliente;
import java.sql.PreparedStatement;

/**
 *
 * @author raphaelmachado
 */
public class ClienteData extends Conexao {

    public ClienteData() throws Exception {
    }

    public boolean incluir(Cliente obj) throws Exception {

        String sql = "insert into clientes (cnpj, endereco, site, revista)"
                + " values(?,?,?,?)";

        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getCnpj());
        ps.setString(2, obj.getEndereco());
        ps.setString(3, obj.getSite());
        ps.setString(4, obj.getRevista());
        int registros = ps.executeUpdate();

        if (registros >= 1) {
            return true;
        } else {
            return false;
        }

    }
}
