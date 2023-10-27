package com.jsp.oneToone_Unidirectional.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor			
public class Person {
	@Id
   private int id;
   private String name;
   private Long phone;
  
   @OneToOne
   @JoinColumn(name="adharid")
   private Aadhar aadhar;
}
