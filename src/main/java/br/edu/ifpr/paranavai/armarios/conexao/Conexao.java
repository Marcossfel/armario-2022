package br.edu.ifpr.paranavai.armarios.conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Conexao {
    private final static String URL = "jdbc:mysql://localhost/emprestimo"; 
    private final static String USUARIO = "root";
    private final static String SENHA = "";
    private static Connection conexao = null;
    
    private Conexao() throws SQLException{
        conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
    }
    
    public static Connection getConexao(){
        if(conexao == null){
            try {
                new Conexao();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return conexao;
    }
}
