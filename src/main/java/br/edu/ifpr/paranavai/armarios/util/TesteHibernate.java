/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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