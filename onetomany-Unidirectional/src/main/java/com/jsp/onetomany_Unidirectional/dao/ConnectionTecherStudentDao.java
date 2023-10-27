package com.jsp.onetomany_Unidirectional.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomany_Unidirectional.dto.Student;
import com.jsp.onetomany_Unidirectional.dto.Teacher;

public class ConnectionTecherStudentDao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("onetomany");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	StudentDao sd=new StudentDao();
	TeacherDao td=new TeacherDao();
	public Teacher connectionTeacherStudent(int t_id,int s_id) {
		 Teacher teacher=td.getbyIdetais(t_id);
		 List<Student> students=teacher.getStudent();
		 students.add(sd.getStudentDetailbyId(s_id));
		 teacher.setStudent(students);
		 et.begin();
		 for (Student student : students) {
			 em.merge(student);
		}
		 em.merge(teacher);
		 
		 et.commit();
		return teacher;
	}

}
