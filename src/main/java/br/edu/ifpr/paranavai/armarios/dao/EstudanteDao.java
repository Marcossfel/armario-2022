
package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import java.util.List;


public interface EstudanteDao {
    public List<Estudante> buscarTodos();
    public Estudante buscarPorId(Integer id);
    public void inserir(Estudante Estudante);
    public void atualizar(Estudante localizacao);
    public void excluir(Estudante Estudante);
}

