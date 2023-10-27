package com.jsp.onetomany_Unidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomany_Unidirectional.dto.Student;
import com.jsp.onetomany_Unidirectional.dto.Teacher;

public class StudentDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetomany");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	TeacherDao td=new TeacherDao();
	public Student saveStudentdetail(Student student) {
		et.begin();
		em.persist(student);
		et.commit();
		return student;
	}
	public Student getStudentDetailbyId(int s_id) {
		return em.find(Student.class, s_id);
	}
	public List<Student> getbyteacherId(int t_id) {
		   Teacher teacher=td.getbyIdetais(t_id);
		return   teacher.getStudent();
	
	}

}
