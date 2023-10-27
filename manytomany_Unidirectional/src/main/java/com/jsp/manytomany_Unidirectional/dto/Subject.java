package com.jsp.manytomany_Unidirectional.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
	@Id
	private int subject_id;
	private String subject_name;
	private String subject_author;
	private LocalDate published_date;

}
