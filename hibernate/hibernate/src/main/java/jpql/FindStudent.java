package jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate.Student;

public class FindStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		String query = "SELECT s FROM Student s WHERE course=: course";
		et.begin();
		
		List<Student> studentList = em.createQuery(query, Student.class).setParameter("course", "Java").getResultList();
		et.commit();
		for (Student student : studentList) {
			System.out.println(student);
		}
		
	}

}
