package com.jsp.hibernate_simple_demo_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_simple_demo_project.dto.Product;


public class ProductDao {
	EntityManagerFactory	entrymanagerfactor=Persistence.createEntityManagerFactory("hibernate");
	 EntityManager entitymanager=entrymanagerfactor.createEntityManager();
	    EntityTransaction entransaction=entitymanager.getTransaction();
	public Product saveProductDao(Product product) {
	    entransaction.begin();
	    entitymanager.persist(product);
	    entransaction.commit();
		return product;
	}
	
	public Product getProductbyId(int id) {
		return entitymanager.find(Product.class, id);
	
	}
	public boolean deleteProductById(int id) {
		Product pr=getProductbyId(id);
		if(pr!=null) {
			entransaction.begin();
			entitymanager.remove(pr);
			entransaction.commit();
			return true;
		}else {
			return false;
		}
	}
	public Product updateProductName(int id,String prname) {
		Product pr=getProductbyId(id);
		pr.setName(prname);
		if(pr!=null) {
			entransaction.begin();
			entitymanager.merge(pr);
			entransaction.commit();
			return pr;
		}else {
			return pr;
		}
		
	}
	public List<Product> getAllProductDetail(){
		String qu="from Product";
    Query query= entitymanager.createQuery(qu);
   return query.getResultList();
       
	}

}
