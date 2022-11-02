package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.servico.LocalizacaoServico;
import java.util.List;

public class LocalizacaoControle {
    public static List<Localizacao> listarTodasLocalizacoes(){
        return LocalizacaoServico.buscarTodos();
    }

    public static Localizacao inserir(Localizacao localizacao) {
        return LocalizacaoServico.inserir(localizacao);
    }

    public static Localizacao buscarPorId(int codigo) {
        return LocalizacaoServico.buscarPorId(codigo);
    }
    public static Localizacao atualizar(Localizacao localizacao) {
        return LocalizacaoServico.atualizar(localizacao);
    }
    
    public static void excluir (Localizacao localizacao) {
        LocalizacaoServico.excluir(localizacao);
    }
}
