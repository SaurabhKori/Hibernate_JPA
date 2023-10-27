package com.jsp.hibernate_simple_demo_project.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
  @author Saurabh
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product {
	@Id
	private int id;
	private String name;
	private String color;
	private double price;
	

}
