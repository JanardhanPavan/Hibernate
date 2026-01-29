package jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate.Student;

public class FIndStudendByName {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String query = "SELECT s FROM Student s WHERE s.name =: name";
		et.begin();
		Student s = em.createQuery(query, Student.class).setParameter("name", "Sowmya").getSingleResult();
		et.commit();
		
		System.out.println(s);
	}

}
