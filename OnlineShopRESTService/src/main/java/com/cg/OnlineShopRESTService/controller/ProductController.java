package com.cg.OnlineShopRESTService.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.OnlineShopRESTService.bean.Product;
import com.cg.OnlineShopRESTService.exception.ProductException;
import com.cg.OnlineShopRESTService.service.IProductService;
import com.cg.OnlineShopRESTService.service.ProductServiceImpl;

@RestController 
public class ProductController {
	
	@Autowired
	private IProductService service;
	
	@RequestMapping(value="/sayHello", method=RequestMethod.GET, produces="application/text")
	public ResponseEntity<String> getHelloMessage() {
		return new ResponseEntity<String>("Hello World from RESTfulWebService", HttpStatus.OK);
	}
	
	@RequestMapping(value="/addProduct", method=RequestMethod.POST, 	consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<Product> saveProduct(@ModelAttribute Product product) throws ProductException {
		//service.createProduct(product);
		//System.out.println("Product in Controller :- "+ product);
		return new ResponseEntity<Product>(service.createProduct(product), HttpStatus.OK);
	}
	
	//@RequestMapping(value="/findProduct", method=RequestMethod.POST, 	consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	@RequestMapping(value="/findProduct", method=RequestMethod.GET, 
			produces="application/JSON")
	public ResponseEntity<Product> findProductById(@PathParam(value="id") String id) throws ProductException {
		//service.createProduct(product);
		return new ResponseEntity<Product>(service.findProduct(id), HttpStatus.OK);
	}	
	
	@RequestMapping(value="/viewAllProducts", method=RequestMethod.GET, produces="application/JSON")
	public ResponseEntity<List<Product>> viewAllProduct() throws ProductException {
		//service.createProduct(product);
		return new ResponseEntity<List<Product>>(service.viewProducts(), HttpStatus.OK);
	}	
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) throws ProductException {
		try {
			return service.createProduct(product);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			throw new ProductException(e.getMessage());
		}
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public List<Product> viewProducts() throws ProductException{
		try {
			return service.viewProducts();
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			throw new ProductException(e.getMessage());
		}
	}
	
	@RequestMapping(value="/find", method=RequestMethod.GET)
	public Product findProduct(String id) throws ProductException{
		try {
			return service.findProduct(id);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			throw new ProductException(e.getMessage());
		}
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) throws ProductException{
		try {
			return service.updateProduct(product);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			throw new ProductException(e.getMessage());
		}
	}

	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public String deleteProduct(String id) throws ProductException{
		try {
			return service.deleteProduct(id);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			throw new ProductException(e.getMessage());
		}
	}
}
