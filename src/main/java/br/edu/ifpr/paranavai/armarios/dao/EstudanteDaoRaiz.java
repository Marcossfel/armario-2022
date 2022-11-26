/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.conexao.Conexao;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EstudanteDaoRaiz implements EstudanteDao {

    @Override
    public List<Estudante> buscarTodos() {
         ArrayList<Estudante> listaDeEstudante = new ArrayList<Estudante>();
        String SQL = "SELECT * FROM tb_estudante";
        
        PreparedStatement sqlPreparada;
        try {
            sqlPreparada = Conexao.getConexao().prepareStatement(SQL);
            
            ResultSet resultado = sqlPreparada.executeQuery();
            
            while(resultado.next()){
                Estudante estudante = transformarResultSetEmObjeto(resultado);
                listaDeEstudante.add(estudante);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return listaDeEstudante;
    }

    @Override
    public Estudante buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Estudante inserir(Estudante estudante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Estudante atualizar(Estudante estudante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluir(Estudante estudante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Estudante transformarResultSetEmObjeto(ResultSet resultado) {
        Estudante estudante = new Estudante();
        
        try {
            estudante.setEstudanteId(resultado.getInt("id_estudante"));
            estudante.setNome(resultado.getString("nome"));
            estudante.setEmail(resultado.getString("email"));
            estudante.setTelefone(resultado.getString("telefone"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return estudante;
    }
    
}
