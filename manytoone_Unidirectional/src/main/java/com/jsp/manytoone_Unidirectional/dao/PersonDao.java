package com.jsp.manytoone_Unidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.manytoone_Unidirectional.dto.Car;
import com.jsp.manytoone_Unidirectional.dto.Person;

public class PersonDao {
	EntityManagerFactory ef=Persistence.createEntityManagerFactory("manytoone");
	 EntityManager em=ef.createEntityManager();
	 EntityTransaction et=em.getTransaction();
	 CarDao cd=new CarDao();
	 public Person savepersondetail(Person person , int carid) {
		 Car car=cd.getCarbyId(carid);
		 if(car!=null) {
			 person.setCar(car);
			 et.begin();
			 em.persist(person);
			 et.commit(); 
			 return person;
		 }
		 
		 return null;
	 }
	 public Person getbyIdpersonditail(int id) {
		 
		 return em.find(Person.class, id);
	 }
	 public void deletePerson(int id) {
		 Person person=getbyIdpersonditail(id);
		 if(person!=null) {
			 et.begin();
			 em.remove(person);
			 et.commit();
		 }
	 }
}
