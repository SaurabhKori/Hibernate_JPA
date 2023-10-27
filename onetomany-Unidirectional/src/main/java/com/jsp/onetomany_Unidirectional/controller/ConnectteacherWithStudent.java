package com.jsp.onetomany_Unidirectional.controller;

import java.util.Scanner;

import com.jsp.onetomany_Unidirectional.dao.ConnectionTecherStudentDao;

public class ConnectteacherWithStudent {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Connect Students with teacher");
	 System.out.println("Enter teacher Id");
	 int teach=sc.nextInt();
	 String ch;
	 do {
		 System.out.println("Enter Student Id");
		 int st=sc.nextInt();
		 
  new ConnectionTecherStudentDao().connectionTeacherStudent(teach, st);
   System.out.println("if want to exit then type y");
		 
   ch=sc.nextLine();
	 }while(!ch.equalsIgnoreCase("y"));
  System.out.println("Done");
}
}
