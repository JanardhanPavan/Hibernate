package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindPerson {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		Aadhar a = em.find(Aadhar.class, 1);
		Person p = em.find(Person.class, 1);
		et.commit();
		System.out.println(a);
		System.out.println(p);

	}

}
