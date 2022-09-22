
package br.edu.ifpr.paranavai.armarios.servico;

import br.edu.ifpr.paranavai.armarios.dao.ReservaDao;
import br.edu.ifpr.paranavai.armarios.dao.ReservaDaoImpl;
import br.edu.ifpr.paranavai.armarios.modelo.Reserva;
import java.util.List;


public class ReservaServicoo {
    private static ReservaDao dao = new ReservaDaoImpl();

    public static List<Reserva> buscarTodos() {
        return dao.buscarTodos();
    }

    public static Reserva buscarPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public static void inserir(Reserva reserva) {
        dao.inserir(reserva);
    }

    public static void atualizar(Reserva reserva) {
        dao.atualizar(reserva);
    }

    public static void excluir(Reserva reserva) {
        dao.excluir(reserva);
    }
}
