package com.jsp.hibernate_simple_demo_project.service;

import java.util.List;

import com.jsp.hibernate_simple_demo_project.dao.ProductDao;
import com.jsp.hibernate_simple_demo_project.dto.Product;

public class ProductService {
	ProductDao pd=new ProductDao();
	public Product saveProductService(Product product) {
		return pd.saveProductDao(product);
	}
	public Product getProductbyIdService(int id) {
		
		return pd.getProductbyId(id);
		
	}
	public boolean deleteProductByIdservice(int id) {
		return pd.deleteProductById(id);
	}
	public Product updateProductNameservice(int id,String prname) {
		return pd.updateProductName(id, prname);
	}
	public List<Product> getAllProductDetailservice(){
		return pd.getAllProductDetail();
	}

}
