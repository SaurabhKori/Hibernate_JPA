package com.jsp.onetomany_Unidirectional.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher {
	@Id
	private int teacher_id;
	private String teacher_Name;
	private String subject;
	@OneToMany(cascade =CascadeType.ALL)
	private List<Student> student;
	public Teacher(int teacher_id, String teacher_Name, String subject) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_Name = teacher_Name;
		this.subject = subject;
	}
	
   
}
