
package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.conexao.HibernateUtil;
import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import java.util.List;
import org.hibernate.Session;


public class ArmarioDaoImpl implements ArmarioDao {
    private Session sessao;

    public ArmarioDaoImpl() {
        this.sessao = HibernateUtil.getSession();
    }

    @Override
    public List<Armario> buscarTodos() {
        List<Armario> armarios = null;
        try {
            sessao.beginTransaction();
            armarios = (List<Armario>) this.sessao.createQuery("from Armario").list();
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return armarios;
    
    }

    @Override
    public Armario buscarPorId(Integer id) {
        Armario armario = null;
        try {
            sessao.beginTransaction();
            armario = (Armario) sessao.get(Armario.class, id);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return armario;
    }

    @Override
    public void inserir(Armario armario) {
         try {
            sessao.beginTransaction();
            sessao.update(armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Armario armario) {
         try {
            sessao.beginTransaction();
            sessao.update(armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(Armario armario) {
        try {
            sessao.beginTransaction();
            sessao.update(armario);
            sessao.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
     }
    }
}
