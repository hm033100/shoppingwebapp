package com.zs.shoppingwebapp.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zs.shoppingwebapp.data.ShoppingCartDataInterface;
import com.zs.shoppingwebapp.model.ShoppingCart;


@Service
public class ShoppingCartService {
	
	@Autowired
	private ShoppingCartDataInterface shoppingCartRepo;
	
	public ShoppingCartService(ShoppingCartDataInterface shoppingCartRepo) {
		this.shoppingCartRepo = shoppingCartRepo;
	}
	
	public List<ShoppingCart> findAll(){
		return shoppingCartRepo.findAll();
	}
	
	public Optional<ShoppingCart> findById(String id){
		return shoppingCartRepo.findById(id);
	}
	
	public ShoppingCart save(ShoppingCart shoppingCart) {
		return shoppingCartRepo.save(shoppingCart);
	}
	
	public void deleteById(String Id){
		shoppingCartRepo.deleteById(Id);
	}

}
