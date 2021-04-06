package com.zs.shoppingwebapp.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zs.shoppingwebapp.business.ProductService;
import com.zs.shoppingwebapp.model.Product;

@CrossOrigin
@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Product> getAll() {
		return productService.findAll();
	}
	
	@RequestMapping(value = "/id", method=RequestMethod.POST)
	public Optional<Product> viewById(@RequestBody Map<String, String> json) {
		String _id = json.get("_id");
		return productService.findById(_id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Product save(@RequestBody Product product) {
		return productService.save(product);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public void deleteById(@RequestBody Map<String, String> json){
		String _id = json.get("_id");
		productService.deleteById(_id);
	}

}
