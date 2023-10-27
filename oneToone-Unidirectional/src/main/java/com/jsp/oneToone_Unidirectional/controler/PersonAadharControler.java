package com.jsp.oneToone_Unidirectional.controler;

import java.time.LocalDate;
import java.util.Scanner;

import com.jsp.oneToone_Unidirectional.dto.Aadhar;
import com.jsp.oneToone_Unidirectional.dto.Person;
import com.jsp.oneToone_Unidirectional.service.PersonAadharService;

public class PersonAadharControler {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    PersonAadharService service=new PersonAadharService();
		Person person=null;
		Aadhar adhar=null;
		
//		while(true) {
			System.out.println("1.InsertPerson\n2.DisplayPersonAdhar");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:{
				System.out.println("enter adhar details");
				System.out.println();
				System.out.println("-----------------------");
				System.out.println("Enter a Adhar number");
				    Long anumber=sc.nextLong();
				    sc.nextLine();
				    System.out.println("Enter a Adhar name");
				   String aname=sc.nextLine();
				   System.out.println("Enter a Father name");
				   String father_name=sc.nextLine();
				   System.out.println("Enter a gender");
				   String gender=sc.nextLine();
				   System.out.println("Enter a date of birth");
				   System.out.println("Enter Year");
				   int year=sc.nextInt();
				   System.out.println("Enter a month");
				   int month=sc.nextInt();
				   System.out.println("Enter date");
				   int date=sc.nextInt();
				 adhar=  new Aadhar(anumber, aname, father_name, gender, LocalDate.of(year, month, date));
				   System.out.println();
				   System.out.println("-------------------------------------------------------------------");
				   System.out.println();
				System.out.println("Enter Person detail");
				System.out.println("Enter Person Id");
				  int id=sc.nextInt();
				  sc.nextLine();
				  System.out.println("Enter Person name");
				  String name=sc.nextLine();
				  System.out.println("Enter Person Phone number");
				   Long phone=sc.nextLong();
				   System.out.println("a");
				 person=  new Person(id, name, phone, adhar);
				   System.out.println("helo");
				   service.saveService(person, adhar);
				System.out.println("hi");
			}
				
				break;

			default:
				System.out.println("invalid choice1");
				break;
			}
//		}
	}
}
