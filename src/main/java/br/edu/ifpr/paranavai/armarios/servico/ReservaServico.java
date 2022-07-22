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
    public static String verifica(String nome, String ra){
       if (nome.equals("Marcos")){
           if (ra.equals("123")){
                return "Sucesso na reserva!";
           }
           return "Ra inválido!";
       }
       return "Nome inválido!";         
    }
    

}
