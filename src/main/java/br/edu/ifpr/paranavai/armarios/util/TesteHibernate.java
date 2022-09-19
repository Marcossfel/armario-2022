package br.edu.ifpr.paranavai.armarios.util;

/**
 *
 * @author Ifpr
 */
import br.edu.ifpr.paranavai.armarios.modelo.Armario;
import org.hibernate.Session;

public class TesteHibernate {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		//Add new Employee object
		Armario emp = new Armario();
		emp.setAtivo(true);
		emp.setNumero("B01");
		emp.setObservacoes("nenhuma");

		session.save(emp);

		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}