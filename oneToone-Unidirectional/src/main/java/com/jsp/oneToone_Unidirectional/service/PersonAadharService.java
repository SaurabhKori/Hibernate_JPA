
package com.jsp.oneToone_Unidirectional.service;

import com.jsp.oneToone_Unidirectional.dao.PersonAadharDao;
import com.jsp.oneToone_Unidirectional.dto.Aadhar;
import com.jsp.oneToone_Unidirectional.dto.Person;

public class PersonAadharService {
    PersonAadharDao pao=new PersonAadharDao();
    public Person saveService(Person person,Aadhar aadhar) {
    	return pao.savePersonAdhar(person, aadhar);
    }
}
