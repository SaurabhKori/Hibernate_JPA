package com.jsp.manytoone_Unidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.manytoone_Unidirectional.dto.Car;

public class CarDao {
	 EntityManagerFactory ef=Persistence.createEntityManagerFactory("manytoone");
	 EntityManager em=ef.createEntityManager();
	 EntityTransaction et=em.getTransaction();
	 public Car saveCarDao(Car car) {
		 et.begin();
		 em.persist(car);
		 et.commit();
		 return car;
	 }
	public Car getCarbyId(int id) {
	    
		return em.find(Car.class,id);
	}

}
