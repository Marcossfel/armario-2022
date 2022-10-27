/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.conexao.Conexao;
import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class BibliotecarioDaoRaiz implements BibliotecarioDao {
    
    @Override
    public List<Bibliotecario> buscarTodos() {
       List<Bibliotecario> listaDeBibliotecario = new ArrayList<Bibliotecario>();
        String SQL = "SELECT * FROM tb_bibliotecario";
        
        PreparedStatement sqlPreparada;
        try {
            sqlPreparada = Conexao.getConexao().prepareStatement(SQL);
            
            ResultSet resultado = sqlPreparada.executeQuery();
            
            while(resultado.next()){
                Bibliotecario biblioteca = transformarResultSetEmObjeto(resultado);
                listaDeBibliotecario.add(biblioteca);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return listaDeBibliotecario;
    }

    @Override
    public Bibliotecario buscarPorId(Integer id) {
        
        return null;
        
    }

    @Override
    public void inserir(Bibliotecario bibliotecario) {
       
    }

    @Override
    public void atualizar(Bibliotecario bibliotecario) {
        
    }

    @Override
    public void excluir(Bibliotecario bibliotecario) {
        
    }

    private Bibliotecario transformarResultSetEmObjeto(ResultSet resultado) {
     Bibliotecario biblioteca = new Bibliotecario();
        
        try {
            biblioteca.setBibliotecarioId(resultado.getInt("id_bibliotecario"));
            biblioteca.setNome(resultado.getString("nome"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return biblioteca;
    }

    @Override
    public void atualizar(Localizacao bibliotecario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
