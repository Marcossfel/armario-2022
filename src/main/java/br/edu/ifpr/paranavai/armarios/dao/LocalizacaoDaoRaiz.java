/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.conexao.Conexao;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class LocalizacaoDaoRaiz implements LocalizacaoDao{

    @Override
    public List<Localizacao> buscarTodos() {
        List<Localizacao> listaDeLocalizacao = new ArrayList<Localizacao>();
        String SQL = "SELECT * FROM tb_localizacao";
        
        PreparedStatement sqlPreparada;
        try {
            sqlPreparada = Conexao.getConexao().prepareStatement(SQL);
            
            ResultSet resultado = sqlPreparada.executeQuery();
            
            while(resultado.next()){
                Localizacao local = transformarResultSetEmObjeto(resultado);
                listaDeLocalizacao.add(local);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return listaDeLocalizacao;
    }

    @Override
    public Localizacao buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Localizacao inserir(Localizacao localizacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Localizacao atualizar(Localizacao localizacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluir(Localizacao localizacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Localizacao transformarResultSetEmObjeto(ResultSet resultado) {
        Localizacao local = new Localizacao();
        
        try {
            local.setLocalizacaoId(resultado.getInt("id_localizaacao"));
            local.setNome(resultado.getString("nome"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return local;
    }
    
}
