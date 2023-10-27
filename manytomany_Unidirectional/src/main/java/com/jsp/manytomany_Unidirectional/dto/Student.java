package com.jsp.manytomany_Unidirectional.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	private int id;
	private String name;
	private String email;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Subject> subject;
	

}
