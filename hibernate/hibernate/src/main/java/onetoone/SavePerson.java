package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Aadhar a = new Aadhar(2, 1234, "Bangalore");
		Person p = new Person(2, "Paul", a);
		
		et.begin();
		em.persist(a);
		em.persist(p);
		
		et.commit();
		System.out.println(a);
		System.out.println(p);
	}
	
}
