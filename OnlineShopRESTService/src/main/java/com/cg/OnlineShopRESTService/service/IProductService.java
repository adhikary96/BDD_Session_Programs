package com.cg.OnlineShopRESTService.service;

import java.util.List;

import com.cg.OnlineShopRESTService.bean.Product;
import com.cg.OnlineShopRESTService.exception.ProductException;

public interface IProductService {
	
	Product createProduct(Product product) throws ProductException;
	Product updateProduct(Product product) throws ProductException;
	String deleteProduct(String id) throws ProductException;
	List<Product> viewProducts() throws ProductException;
	Product findProduct(String id) throws ProductException;
	
}
