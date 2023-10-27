package com.jsp.oneToone_Unidirectional.dto;

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
public class Aadhar {
	@Id
  private Long anumber;
  private String aname;
  private String father_name;
   private String gender;
  private LocalDate dob;
}
