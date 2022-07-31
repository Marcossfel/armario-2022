/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.servico;

/**
 *
 * @author Jessica
 */
public class ReservaServico {
    public static String verifica(String ra, String nome){
       if (ra.equals("20020227585")){
           if (nome.equals("marcos")){
                return "Reserva realizada com sucesso!";
           }
           return "Nome inválido!";
       }
       return "Ra inválido!";         
    }
        
}
