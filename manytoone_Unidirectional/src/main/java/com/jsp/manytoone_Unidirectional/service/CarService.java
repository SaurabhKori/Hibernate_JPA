package com.jsp.manytoone_Unidirectional.service;

import com.jsp.manytoone_Unidirectional.dao.CarDao;
import com.jsp.manytoone_Unidirectional.dto.Car;

public class CarService {
	CarDao cd=new CarDao();
	public Car saveCarDaoservice(Car car) {
		return cd.saveCarDao(car);
	}
	public Car getCarbyIdService(int id) {
		return cd.getCarbyId(id);
	}

}
