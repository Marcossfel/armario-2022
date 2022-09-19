
package br.edu.ifpr.paranavai.armarios.servico;


public class LoginServico {

    public static String verifica(String email, String senha){
       if (email.equals("admin@admin.com")){
           if (senha.equals("12345")){
                return "Sucesso no login!";
           }
           return "Senha inválida!";
       }
       return "E-mail inválido!";         
    }
    
}
