package com.jsp.onetomany_Unidirectional.controller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.onetomany_Unidirectional.dto.Student;
import com.jsp.onetomany_Unidirectional.dto.Teacher;
import com.jsp.onetomany_Unidirectional.service.TeacherStudentService;

public class TeacherStudentController {
     public static void main(String[] args) {
		List<Student> studentlist=new ArrayList<Student>();
		studentlist.add(new Student(3, "Raj", "raj@gmail.com"));
		studentlist.add(new Student(7, "shivam", "shivam@gmail.com"));
		studentlist.add(new Student(6, "amit", "amit@gmail.com"));
		
		
	      for (Student student : studentlist) {
	    	  System.out.println(student);
			
		}
		Teacher teacher=new Teacher(2, "Sambhu Sir", "Java", studentlist);
		System.out.println(teacher);
		TeacherStudentService service=new TeacherStudentService();
	Teacher t=	service.saveStudentService(teacher, studentlist);
	
		
	}
}
