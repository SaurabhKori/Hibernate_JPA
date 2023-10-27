package com.jsp.manytoone_Unidirectional.controller;

import com.jsp.manytoone_Unidirectional.dto.Car;
import com.jsp.manytoone_Unidirectional.dto.Person;
import com.jsp.manytoone_Unidirectional.service.PersonService;

public class PersonController {
	public static void main(String[] args) {
		PersonService ps=new PersonService();
		Car car=new Car();
		Person person=ps.savepersondetailservice(new Person(13, "Shankar", "shankar@gmail.com",car), 101);
	}

}
