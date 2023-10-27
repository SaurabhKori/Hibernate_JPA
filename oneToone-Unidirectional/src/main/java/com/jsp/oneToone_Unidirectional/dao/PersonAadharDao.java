package com.jsp.oneToone_Unidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.oneToone_Unidirectional.dto.Aadhar;
import com.jsp.oneToone_Unidirectional.dto.Person;

public class PersonAadharDao {
	
	EntityManagerFactory entitymanagerFactory=Persistence.createEntityManagerFactory("hibernate");
    EntityManager entitymanager=entitymanagerFactory.createEntityManager();
    EntityTransaction entityTransiction=entitymanager.getTransaction();
	   public Person savePersonAdhar(Person person,Aadhar aadhar) {
		   entityTransiction.begin();
		   entitymanager.persist(person);
		   entitymanager.persist(aadhar);
		   entityTransiction.commit();
		   return person;
	
	   }

}
