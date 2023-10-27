package com.jsp.onetomany_Unidirectional.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    @Id
    private int student_rollno;
    private String student_name;
    private String studentemail;
    
    
}
