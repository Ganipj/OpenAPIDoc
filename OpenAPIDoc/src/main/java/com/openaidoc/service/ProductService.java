package com.openaidoc.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.openaidoc.entity.Product;
import com.openaidoc.repositry.ProductRepositry;

@Service
public class ProductService {

	@Autowired
	private ProductRepositry productRepositry;

	//save
	public Product saveProduct(Product product) {
		return productRepositry.save(product);
	}
	
	//getAll
	public List<Product> getAllProduct(){
		return productRepositry.findAll();
	}
	
	//getProductById
	public Product getByProductId(Long id) {
		return productRepositry.findById(id).orElse(null);
	}
	
	//updateProduct
	public Product updateProduct(Product product) {
		Product productDetails =  productRepositry.findById(product.getId()).get();
		productDetails.setProductName(product.getProductName());
		productDetails.setPrice(product.getPrice());
		productDetails.setDept(product.getDept());
		return productRepositry.save(productDetails);
	}
	
	//deleteProduct
	public String deleteProductById(Long id) {
		productRepositry.deleteById(id);
		return "Product deleted Successfully";
	}

}
