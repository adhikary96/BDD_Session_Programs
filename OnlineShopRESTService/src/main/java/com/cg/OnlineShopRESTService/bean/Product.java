package com.cg.OnlineShopRESTService.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Product {
	
	@Id 
	private String productCode;
	private String name;
	private String description;
	private double price;
	private String manufactureDate;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public Product(String productCode, String name, String description, double price, String manufactureDate) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.description = description;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", name=" + name + ", description=" + description + ", price="
				+ price + ", manufactureDate=" + manufactureDate + "]";
	}
	
	
}
