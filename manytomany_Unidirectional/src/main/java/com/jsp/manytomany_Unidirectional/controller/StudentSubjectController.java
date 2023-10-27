package com.jsp.manytomany_Unidirectional.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.jsp.manytomany_Unidirectional.dao.StudentSubjectService;
import com.jsp.manytomany_Unidirectional.dto.Student;
import com.jsp.manytomany_Unidirectional.dto.Subject;

public class StudentSubjectController {
 public static void main(String[] args) {
	List<Subject> subject=new ArrayList<Subject>();
	subject.add(new Subject(121, "Java", "Gosling", LocalDate.of(1995, 10, 13)));
	subject.add(new Subject(122, "Html", "Berden Eich", LocalDate.of(1995, 11, 23)));
	subject.add(new Subject(123, "Css", "Tim Howkun", LocalDate.of(1995, 12, 15)));
	List<Student> student=new ArrayList<Student>();
	student.add(new Student(11, "Saurabh", "saurabh@gmail.com", subject));
	student.add(new Student(12, "Anurag", "anurag@gmail.com", subject));
	new StudentSubjectService().saveStudentSubjectService(student);
	
}
}
