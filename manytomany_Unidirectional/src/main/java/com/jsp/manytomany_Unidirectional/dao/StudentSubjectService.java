package com.jsp.manytomany_Unidirectional.dao;

import java.util.List;

import com.jsp.manytomany_Unidirectional.dto.Student;
import com.jsp.manytomany_Unidirectional.dto.Subject;

public class StudentSubjectService {
	StudentSubjectDao ssd=new StudentSubjectDao();
	public List<Student> saveStudentSubjectService(List<Student> student){
		return ssd.saveStudentSubjectDao(student);
	}
	public List<Subject> getSubjectIdStudetntService(int studentId){
		return ssd.getSubjectIdStudetnt(studentId);
	}

}
