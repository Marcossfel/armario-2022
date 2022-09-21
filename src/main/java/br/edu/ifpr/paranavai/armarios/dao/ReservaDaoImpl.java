
package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.armarios.modelo.Reserva;
import java.util.List;
import org.hibernate.Session;

public class ReservaDaoImpl implements ReservaDao  {
   private Session sessao;

    public ReservaDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    } 

    @Override
    public List<Reserva> buscarTodos() {
        List<Reserva> reservas = null;
        try {
            sessao.beginTransaction();
            reservas = (List<Reserva>) this.sessao.createQuery("from Reserva").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reservas;
    }

    @Override
    public Reserva buscarPorId(Integer id) {
        Reserva reserva = null;
        try {
            sessao.beginTransaction();
            reserva = (Reserva) sessao.get(Reserva.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reserva;
    }

    @Override
    public void inserir(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.persist(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Reserva reserva) {
        try {
            sessao.beginTransaction();
            sessao.persist(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Reserva reserva) {
       try {
            sessao.beginTransaction();
            sessao.persist(reserva);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
