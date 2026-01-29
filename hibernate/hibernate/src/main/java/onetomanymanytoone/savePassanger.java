package onetomanymanytoone;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class savePassanger {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Passanger p1 = new Passanger(101, "Pavan", null);
		Passanger p2 = new Passanger(102, "Paul", null);
		Passanger p3 = new Passanger(103, "Swathi", null);
		List<Passanger> passList = Arrays.asList(p1,p2,p3);
		
		Train t = new Train(201, "Paul Express", passList);
		p1.setTrain(t);
		p2.setTrain(t);
		p3.setTrain(t);
		
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(t);
		et.commit();
	}

}
