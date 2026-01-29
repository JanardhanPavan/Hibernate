package onetomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class saveCompany {

	public static void main(String[] args) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Employee e1 = new Employee(1, "pavan", 50000);
			Employee e2 = new Employee(2, "paul", 100000);
			Employee e3 = new Employee(3, "swathi", 75000);
			
			List<Employee> elist = Arrays.asList(e1,e2,e3);
			Company c = new Company(1, "Sowmya", elist);
			et.begin();
			em.persist(e1);
			em.persist(e2);
			em.persist(e3);
			em.persist(c);
			
			et.commit();
	}

}
