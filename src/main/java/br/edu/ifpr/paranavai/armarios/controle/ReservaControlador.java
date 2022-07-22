/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.servico.ReservaServico;

/**
 *
 * @author Jessica
 */
public class ReservaControlador {
    public static String verifica(String nome, String ra) {
        return ReservaServico.verifica(nome,ra);
    }
}
