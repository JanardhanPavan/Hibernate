package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindTeacher {
	public static void main(String[] args) {
		EntityManagerFactory emp = Persistence.createEntityManagerFactory("app");
		EntityManager em = emp.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		 				  //classname, primarykey
		Teacher t = em.find(Teacher.class, 1);
		
		et.commit();
		System.out.println(t);
	}

}
