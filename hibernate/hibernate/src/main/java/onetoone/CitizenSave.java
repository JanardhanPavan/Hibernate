package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CitizenSave {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Pan p = new Pan(1, 5803, "hyd", null);
		Citizen c = new Citizen(1, "pavan", p);
		p.setCitizen(c);
		
		et.begin();
		em.persist(p);
		em.persist(c);
		et.commit();

	}

}
