
package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.conexao.Conexao;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import br.edu.ifpr.paranavai.armarios.modelo.Reserva;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ReservaDaoRaiz implements ReservaDao {

    @Override
    public List<Reserva> buscarTodos() {
        List<Reserva> listaDeReserva = new ArrayList<Reserva>();
        String SQL = "SELECT * FROM tb_reserva";
        
        PreparedStatement sqlPreparada;
        try {
            sqlPreparada = Conexao.getConexao().prepareStatement(SQL);
            
            ResultSet resultado = sqlPreparada.executeQuery();
            
            while(resultado.next()){
                Reserva reserva = transformarResultSetEmObjeto(resultado);
                listaDeReserva.add(reserva );
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return listaDeReserva;
    }

    @Override
    public Reserva buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void inserir(Reserva reserva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atualizar(Reserva reserva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void excluir(Reserva reserva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Reserva transformarResultSetEmObjeto(ResultSet resultado) {
       Reserva reserva= new Reserva();
        
        try {
            reserva.setReservaId(resultado.getInt("id_reserva"));
            reserva.setEstudante((Estudante) resultado.getObject("estudante"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return reserva;
    }
    
    
}
