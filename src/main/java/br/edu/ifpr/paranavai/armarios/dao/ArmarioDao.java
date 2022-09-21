
package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import java.util.List;

public interface ArmarioDao {
    public List<Armario> buscarTodos();
    public Armario buscarPorId(Integer id);
    public void inserir(Armario armario);
    public void atualizar(Armario armario);
    public void excluir(Armario armario);
}


