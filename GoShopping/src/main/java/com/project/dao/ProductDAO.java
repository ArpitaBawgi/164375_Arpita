package com.project.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.project.interfaces.IProductDAO;
import com.project.pojo.Product;

public class ProductDAO implements IProductDAO{
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	

	public int addProduct(int productId, String productName, double productPrice) {
		String sqlQuery = "insert into productTable values(" + productId+ ",'" + productName + "','" +productPrice + "')";

		return jdbcTemplate.update(sqlQuery);
	}

	public int remove(int productId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(int productId, String productName) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getProduct(int productId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
