package com.jd.im.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ProductServiceImpl implements ProductService{

	public List<Product> retrieveAllProducts() {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product());
		return list;
	}

	public Product retrieveProductById(long id) {
		return new Product();
	}

	public List<Product> retrieveProductsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product updateProductById(long id, Map<String, Object> fieldMap) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product deleteProductById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
