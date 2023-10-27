package com.jsp.onetomany_Unidirectional.service;

import java.util.List;

import com.jsp.onetomany_Unidirectional.dao.TeacherStudentDao;
import com.jsp.onetomany_Unidirectional.dto.Student;
import com.jsp.onetomany_Unidirectional.dto.Teacher;

public class TeacherStudentService {
	TeacherStudentDao tsd=new TeacherStudentDao();
	public Teacher saveStudentService(Teacher teacher,List<Student> student) {
		return tsd.saveTeacherStudentDao(teacher, student);
	}

}
