
package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import java.util.List;


public interface EstudanteDao {
    public List<Estudante> buscarTodos();
    public Estudante buscarPorId(Integer id);
    public Estudante inserir(Estudante estudante);
    public Estudante atualizar(Estudante estudante);
    public void excluir(Estudante estudante);
}

