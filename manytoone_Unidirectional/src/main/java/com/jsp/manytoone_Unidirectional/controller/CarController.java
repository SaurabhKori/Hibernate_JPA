package com.jsp.manytoone_Unidirectional.controller;

import com.jsp.manytoone_Unidirectional.dto.Car;
import com.jsp.manytoone_Unidirectional.service.CarService;

public class CarController {
	public static void main(String[] args) {
		CarService cs=new CarService();
		Car car=cs.saveCarDaoservice(new Car(101, "Audi", "Black", 750000.00));
	}

}
