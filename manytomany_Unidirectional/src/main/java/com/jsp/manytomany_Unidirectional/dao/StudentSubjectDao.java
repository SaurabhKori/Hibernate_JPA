package com.jsp.manytomany_Unidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.manytomany_Unidirectional.dto.Student;
import com.jsp.manytomany_Unidirectional.dto.Subject;

public class StudentSubjectDao {
	EntityManagerFactory ef=Persistence.createEntityManagerFactory("hibernate");
	EntityManager em=ef.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public List<Student> saveStudentSubjectDao(List<Student> student){
		for (Student student2 : student) {
			et.begin();
			em.persist(student2);
			et.commit();
			
		}
		
		return student;
	}
	public List<Subject> getSubjectIdStudetnt(int studentId){
	Student student=	em.find(Student.class, studentId);
	return student.getSubject();
		
	}

}
