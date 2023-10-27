package com.jsp.manytoone_Unidirectional.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
	@Id
   private int carId;
   private String carName;
   private String carColor;
   private double carPrice;
   
}
