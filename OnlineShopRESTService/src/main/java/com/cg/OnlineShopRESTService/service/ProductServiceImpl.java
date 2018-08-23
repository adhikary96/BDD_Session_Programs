package com.cg.OnlineShopRESTService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.OnlineShopRESTService.bean.Product;
import com.cg.OnlineShopRESTService.exception.ProductException;
import com.cg.OnlineShopRESTService.repo.IProductRepo;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductRepo repo;
	
	
	@Override
	public Product createProduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		/*if (validateProduct(product))
			repo.save(product);
		return product;*/
		return repo.save(product);
	}
	
	
	@Override
	public Product updateProduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		if(viewProducts().contains(product))
			throw new ProductException("No Such product there to update");
		Product product2 = repo.getOne(product.getProductCode());
		product2.setPrice(product.getPrice());
		return repo.save(product2);
	}
	


	@Override
	public String deleteProduct(String id) throws ProductException {
		// TODO Auto-generated method stub
		if(repo.getOne(id) == null)
			throw new ProductException("No product present to be deleted");
		repo.deleteById(id);
		return id;
	}
	

	@Override
	public List<Product> viewProducts() throws ProductException {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
	@Override
	public Product findProduct(String id) throws ProductException {
		// TODO Auto-generated method stub
		try {
			return repo.getOne(id);
		} catch(Exception e) {
			// TODO: handle exception
			throw new ProductException("No product present");
		}
		
	}
	
	
	/*private boolean validateProduct(Product product) throws ProductException {
		if(product == null)
			throw new ProductException("Product doesnot exist");
		if(product.getProductCode().isEmpty())
			throw new ProductException("ID cannot be empty");
		if(product.getName().isEmpty())
			throw new ProductException("Name cannot be empty");
		if(!product.getName().matches("[A-Za-z]{2,}"))
			throw new ProductException("name must have only alphabets");
		if(product.getDescription().isEmpty())
			throw new ProductException("Product name cannot be empty");
		if(product.getPrice()<0)
			throw new ProductException("Price must be more than zero");
		return true;
		
	}*/

}
