package com.jsp.manytoone_Unidirectional.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	@Id
	private int personId;
	private String personName;
	private String personEmail;
	@ManyToOne
	@JoinColumn(name="carid")
	private Car car;

}
