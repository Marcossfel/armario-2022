
package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.armarios.modelo.Bibliotecario;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import java.util.List;
import org.hibernate.Session;


public class BibliotecarioDaoImpl implements BibliotecarioDao  {
    private Session sessao;

    public BibliotecarioDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Bibliotecario> buscarTodos() {
        List<Bibliotecario> bibliotecarios = null;
        try {
            sessao.beginTransaction();
            bibliotecarios = (List<Bibliotecario>) this.sessao.createQuery("from Bibliotecario").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bibliotecarios;
    }

    @Override
    public Bibliotecario buscarPorId(Integer id) {
        Bibliotecario bibliotecario = null;
        try {
            sessao.beginTransaction();
            bibliotecario = (Bibliotecario) sessao.get(Bibliotecario.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bibliotecario;
    }

    @Override
    public void inserir(Bibliotecario bibliotecario) {
        try {
            sessao.beginTransaction();
            sessao.update(bibliotecario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Bibliotecario bibliotecario) {
        try {
            sessao.beginTransaction();
            sessao.update(bibliotecario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
      }
    }

    @Override
    public void excluir(Bibliotecario bibliotecario) {
        try {
            sessao.beginTransaction();
            sessao.update(bibliotecario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
      }
    }
}
