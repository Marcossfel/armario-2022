/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.servico.BibliotecarioServico;
import br.edu.ifpr.paranavai.armarios.servico.LocalizacaoServico;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class BibliotecarioControle {
    public static List<Bibliotecario> listarTodasLocalizacoes(){
        return BibliotecarioServico.buscarTodos();
    }
}
