package manytomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePatientDoctor {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Patient p1 = new Patient(101, "pavan", null);
		Patient p2 = new Patient(102, "Paul", null);
		Patient p3 = new Patient(103, "sowmya", null);
		
		List<Patient> plist1 = Arrays.asList(p1,p2);
		List<Patient> plist2 = Arrays.asList(p2,p3);
		
		Doctor d1 = new Doctor(201, "MR.White", plist2);
		Doctor d2 = new Doctor(202, "Swathi", plist1);
		Doctor d3 = new Doctor(203, "Shrujan", plist2);
		Doctor d4 = new Doctor(204, "Snigdha", plist1);
		
		List<Doctor> dlist1 = Arrays.asList(d1,d2,d3);
		List<Doctor> dlist2 = Arrays.asList(d3,d4);
		
		p1.setDlist(dlist1);
		p2.setDlist(dlist2);
		p3.setDlist(dlist2);
		
		et.begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		
		em.persist(d1);
		em.persist(d2);
		em.persist(d3);
		em.persist(d4);
		
		et.commit();
	}

}
