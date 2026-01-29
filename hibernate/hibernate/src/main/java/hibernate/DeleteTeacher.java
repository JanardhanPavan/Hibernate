package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteTeacher {

	public static void main(String[] args) {
		EntityManagerFactory emp = Persistence.createEntityManagerFactory("app");
		EntityManager em = emp.createEntityManager();// used to perform all crud operations
		EntityTransaction et = em.getTransaction();
		
		et.begin();
						  //classname, primarykey
		Teacher t = em.find(Teacher.class, 1);
		if(t != null) {
			em.remove(t);
			System.out.println("Teacher Deleted");
			
		}else {
			System.out.println("Teacher Not found");
		}
		
		et.commit();
		System.out.println(t);

	}

}
