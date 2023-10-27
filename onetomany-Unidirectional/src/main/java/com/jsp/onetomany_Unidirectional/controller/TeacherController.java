package com.jsp.onetomany_Unidirectional.controller;

import com.jsp.onetomany_Unidirectional.dao.TeacherDao;
import com.jsp.onetomany_Unidirectional.dto.Teacher;

public class TeacherController {
	public static void main(String[] args) {
		new TeacherDao().saveTeacherdetail(new Teacher(3,"Nazim","Sql"));
	}

}
