package com.jsp.onetomany_Unidirectional.controller;

import com.jsp.onetomany_Unidirectional.dao.StudentDao;
import com.jsp.onetomany_Unidirectional.dto.Student;

public class StudentControler {
	public static void main(String[] args) {
		new StudentDao().saveStudentdetail(new Student(9,"Amit","amit@gmail.com"));
	}

}
