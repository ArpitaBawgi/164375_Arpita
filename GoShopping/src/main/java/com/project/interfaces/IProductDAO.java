package com.project.interfaces;

import java.util.List;

import com.project.pojo.Product;
import com.project.pojo.User;

public interface IProductDAO {
	public int addProduct(int productId, String productName, double productPrice);
	public int remove(int productId);
	public int update(int productId,  String productName);
	public int getProduct(int productId);
	public List<Product> getAllProducts();

}
