
package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.armarios.modelo.Estudante;
import java.util.List;
import org.hibernate.Session;


public class EstudanteDaolmpl implements EstudanteDao {
private Session sessao;

    public EstudanteDaolmpl() {
        this.sessao = HibernateUtil.getSession();
    }
    @Override
    public List<Estudante> buscarTodos() {
        List<Estudante> Estudantes = null;
        try {
            sessao.beginTransaction();
            Estudantes = (List<Estudante>) this.sessao.createQuery("from Localizacao").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Estudantes;
    
    }

    @Override
    public Estudante buscarPorId(Integer id) {
            Estudante Estudante = null;
        try {
            sessao.beginTransaction();
            Estudante = (Estudante) sessao.get(Estudante.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Estudante;
    
    }

    @Override
    public void inserir(Estudante estudante) {
           try {
            sessao.beginTransaction();
            sessao.update(estudante);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Estudante estudante) {
        try {
            sessao.beginTransaction();
            sessao.update(estudante);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
      }
    }
    @Override
    public void excluir(Estudante estudante) {
        try {
            sessao.beginTransaction();
            sessao.update(estudante);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
     }
   }
}

