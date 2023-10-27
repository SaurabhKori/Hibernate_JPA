package com.jsp.hibernate_simple_demo_project.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_simple_demo_project.dto.Product;
import com.jsp.hibernate_simple_demo_project.service.ProductService;

public class ProductControler {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Product pr=new Product();
		ProductService ps=new ProductService();
         String ch;
		do {
			System.out.print("1: Insert\n 2:Update\n 3:Delete\n 4:displayOneData\n 5:displayOneData\n 6:Insert multiple detail\n 7:get all blue product\n");
			System.out.println("Type your Choice");
			switch(sc.nextInt()) {
			case 1:
				{System.out.println("Enter your Id");
				 pr.setId(sc.nextInt());
				 sc.nextLine();
				 System.out.println("Enter your Product Name");
				 pr.setName(sc.nextLine());
				 System.out.println("Enter your Product Color");
				 pr.setColor(sc.nextLine());
				 System.out.println("Enter your Product Price");
				 pr.setPrice(sc.nextDouble());
				 ps.saveProductService(pr);}
				 break;
			case 2:
				{System.out.println("Enter your Id");
				int id1=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your new Product name");
				String name=sc.nextLine();
				Product product=ps.updateProductNameservice(id1, name);
				if(product!=null) {
			    	System.out.println("Name is updated..........");
			    }
			    else {
			    	System.out.println("Given Id is not found......");
			    }}
				break;
			case 3:
				System.out.println("Enter your Id");
				int id2=sc.nextInt();
				boolean b1=ps.deleteProductByIdservice(id2);
				if(b1==true) {
					System.out.println("Deleted");
				}else {
					System.out.println("ID not found...");
				}
				break;
			case 4:
				{System.out.println("Enter a Id");
				int id =sc.nextInt();
				Product product1=ps.getProductbyIdService(id);
			    if(product1!=null) {
			    	System.out.println(product1);
			    }
			    else {
			    	System.out.println("Given Id is not found......");
			    }}
			break;
			case 5:
			{
				System.out.println("display all detail of product");
				List<Product> pl=ps.getAllProductDetailservice();
				for(Product p:pl) {
					System.out.println(p);
				}
			}
			case 6:
				{System.out.println("insert multiple detail at a time ");
				do {
					System.out.println("Enter product ID");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter product name");
					String name=sc.nextLine();
					System.out.println("Enter product color");
					String color=sc.nextLine();
					System.out.println("Enter product price ");
					double price=sc.nextLong();
					Product p=new Product(id, name, color, price);
					ps.saveProductService(p);
					System.out.println();
					System.out.println("----------------------------------------------------------------------");
					System.out.print(" If you want to exit\n type: exit");
					sc.nextLine();
		            ch=sc.nextLine();
				}while(!ch.equals("exit"));}
			
			break;
			case 7:{
				System.out.println("display all detail of product");
				List<Product> pl=ps.getAllProductDetailservice();
				for(Product p:pl) {
					if(p.getColor().equalsIgnoreCase("blue")) {
						System.out.println(p);
					}
				}
			}
				default :
				  System.out.println("Invalid choise");
					break;
			
		}
			System.out.print(" If you want to exit\n type: exit");
			sc.nextLine();
            ch=sc.nextLine();
            }while(!ch.equals("exit"));
		}
		
}
	
	


