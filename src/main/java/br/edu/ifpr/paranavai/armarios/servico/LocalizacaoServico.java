package br.edu.ifpr.paranavai.armarios.servico;

import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.dao.LocalizacaoDao;
import br.edu.ifpr.paranavai.armarios.dao.LocalizacaoDaoImpl;
import java.util.List;

public class LocalizacaoServico {

    private static LocalizacaoDao dao = new LocalizacaoDaoImpl();

    public static List<Localizacao> buscarTodos() {
        return dao.buscarTodos();
    }

    public static Localizacao buscarPorId(Integer id) {
        return dao.buscarPorId(id);
    }

    public static Localizacao inserir(Localizacao localizacao) {
        return dao.inserir(localizacao);
    }

    public static Localizacao atualizar(Localizacao localizacao) {
        return dao.atualizar(localizacao);
    }

    public static void excluir(Localizacao localizacao) {
        dao.excluir(localizacao);
    }
}
