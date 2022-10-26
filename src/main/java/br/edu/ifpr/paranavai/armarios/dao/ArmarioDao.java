package br.edu.ifpr.paranavai.armarios.dao;

import java.util.List;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;

public interface ArmarioDao {
    public List<Armario> buscarTodos();
    public Armario buscarPorId(Integer id);
    public void inserir(Armario localizacao);
    public void atualizar(Armario localizacao);
    public void excluir(Armario localizacao);
}
