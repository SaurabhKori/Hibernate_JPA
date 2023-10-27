package com.jsp.onetomany_Unidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomany_Unidirectional.dto.Teacher;

public class TeacherDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetomany");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public Teacher saveTeacherdetail(Teacher teacher) {
		et.begin();
		em.persist(teacher);
		et.commit();
		return teacher;
	}
	public Teacher getbyIdetais(int t_id) {
		return em.find(Teacher.class, t_id);
		
	}
	

}
