package br.edu.ifpr.paranavai.armarios.dao;

import java.util.List;
import br.edu.ifpr.paranavai.armarios.modelo.Localizacao;

public interface LocalizacaoDao {
    public List<Localizacao> buscarTodos();
    public Localizacao buscarPorId(Integer id);
    public Localizacao inserir(Localizacao localizacao);
    public Localizacao atualizar(Localizacao localizacao);
    public void excluir(Localizacao localizacao);
}
