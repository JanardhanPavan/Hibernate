package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanymanytoone.Passanger;
import onetomanymanytoone.Train;

public class FindTrain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Train t = em.find(Train.class, 201);
		Passanger p = em.find(Passanger.class, 1.01);
		et.commit();
		
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(p.getId());
		System.out.println(p.getName());

	}

}
