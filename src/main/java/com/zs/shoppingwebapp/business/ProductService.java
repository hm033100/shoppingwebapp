package com.zs.shoppingwebapp.business;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zs.shoppingwebapp.data.ProductDataInterface;
import com.zs.shoppingwebapp.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDataInterface productRepo;
	
	public ProductService(ProductDataInterface productRepo) {
		this.productRepo = productRepo;
	}
	
	public List<Product> findAll(){
		return productRepo.findAll();
	}
	
	public Optional<Product> findById(String id){
		return productRepo.findById(id);
	}
	
	public Product save(Product product) {
		return productRepo.save(product);
	}
	
	public void deleteById(String Id){
		productRepo.deleteById(Id);
	}

}
