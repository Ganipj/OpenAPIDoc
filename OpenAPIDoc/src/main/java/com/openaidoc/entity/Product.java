package com.openaidoc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String productName;
	private Double price;
	private String dept;
	
	public Product() {
		
	}
	public Product(Long id, String productName, Double price, String dept) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.dept = dept;
	}
	
	public Product(String productName, Double price, String dept) {
		super();
		this.productName = productName;
		this.price = price;
		this.dept = dept;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
	

}
