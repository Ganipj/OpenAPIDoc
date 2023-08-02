package com.openaidoc.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openaidoc.entity.Product;
import com.openaidoc.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		return new ResponseEntity<Product>(productService.saveProduct(product),HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> fetchAllProduct(){
		return new ResponseEntity<List<Product>>(productService.getAllProduct(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> fetchByProductById(@PathVariable Long id){
		return new ResponseEntity<Product>(productService.getByProductId(id),HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product){
		return new ResponseEntity<Product>(productService.updateProduct(product),HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteByProductId(@PathVariable Long id){
		return new ResponseEntity<String>(productService.deleteProductById(id),HttpStatus.OK);
	}

}
