package br.edu.ifpr.paranavai.armarios.controle;

import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;
import br.edu.ifpr.paranavai.armarios.servico.LocalizacaoServico;
import java.util.List;

public class LocalizacaoControle {
    public static List<Localizacao> listarTodasLocalizacoes(){
        return LocalizacaoServico.buscarTodos();
    }
}
