package com.jsp.manytoone_Unidirectional.service;

import com.jsp.manytoone_Unidirectional.dao.PersonDao;
import com.jsp.manytoone_Unidirectional.dto.Person;

public class PersonService {
	PersonDao pd=new PersonDao();
	 public Person savepersondetailservice(Person person , int carid) {
		 return pd.savepersondetail(person, carid);
	 }
	 public Person getbyIdpersonservice(int id) {
		 return pd.getbyIdpersonditail(id);
	 }
	 public void deletePersonservice(int id) {
		  pd.deletePerson(id);
	 }
}
