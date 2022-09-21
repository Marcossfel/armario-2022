package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import java.util.List;


public interface BibliotecarioDao {
    public List<Bibliotecario> buscarTodos();
    public Bibliotecario buscarPorId(Integer id);
    public void inserir(Bibliotecario bibliotecario);
    public void atualizar(Bibliotecario bibliotecario);
    public void excluir(Bibliotecario bibliotecario);
}
