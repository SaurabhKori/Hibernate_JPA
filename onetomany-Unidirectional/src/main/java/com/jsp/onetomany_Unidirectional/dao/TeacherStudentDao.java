package com.jsp.onetomany_Unidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomany_Unidirectional.dto.Student;
import com.jsp.onetomany_Unidirectional.dto.Teacher;

public class TeacherStudentDao {
	EntityManagerFactory entitymanagerfactor=Persistence.createEntityManagerFactory("onetomany");
    EntityManager entitymanager=entitymanagerfactor.createEntityManager();
  EntityTransaction  entitytraciction=entitymanager.getTransaction();
      public Teacher saveTeacherStudentDao(Teacher teacher,List<Student> student) {
         entitytraciction.begin();
         teacher.setStudent(student);
         for (Student student2 : student) {
			entitymanager.persist(student2);
		}
         entitymanager.persist(teacher);
         entitytraciction.commit();
    	  return teacher;
      }
}
