package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveCustomer {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Bank b = new Bank(1, "ICICI");
		Bank b1 = new Bank(2, "HDFC");
		
		Customers c1 = new Customers(1,"Pavan", b);
		Customers c2 = new Customers(2, "Paul", b);
		Customers c3 = new Customers(3, "shrujan", b1);
		Customers c4 = new Customers(4, "sowmya", b1);
	
		et.begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(c4);
		em.persist(b);
		em.persist(b1);
		
		et.commit();
	}

}
