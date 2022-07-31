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
    public static String verifica(String ra, String nome,String numero,String status,boolean reserva,boolean devolucao){
       if (ra.equals("20020227585")){
           if (nome.equals("Marcos Felipe da Silva Ribeiro")){
                if (numero.equals("1")){
                    if (status.equals("Reservado") && reserva == true || status.equals("Disponivel") && devolucao == true){
                       return "Reserva realizada com sucesso";  
                        }
                        return "Status de armario Disponivel, devera ser marcado Devolução e status Reservado para Reservas!";
               } 
               return "Armario ocupado ou insira um outro numero para o armario desejado!";
           }
           return "Nome inválido!";
       }
       return "Ra inválido!";  
    }       
}
   
