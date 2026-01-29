package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {
	public static void main(String[] args) {
		
		EntityManagerFactory emp = Persistence.createEntityManagerFactory("app");
		EntityManager em = emp.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Teacher t = new Teacher(1, "pavan","Java");
		
		et.begin();
		
		em.persist(t);
		
		et.commit();
	}
}
