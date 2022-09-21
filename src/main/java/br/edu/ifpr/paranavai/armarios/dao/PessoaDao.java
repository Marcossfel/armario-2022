
package br.edu.ifpr.paranavai.armarios.dao;


import br.edu.ifpr.paranavai.armarios.modelo.Pessoa;
import java.util.List;


public interface PessoaDao {
    public List<Pessoa> buscarTodos();
    public Pessoa buscarPorId(Integer id);
    public void inserir(Pessoa pessoa);
    public void atualizar(Pessoa pessoa);
    public void excluir(Pessoa pessoa);
}
