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

import com.zs.shoppingwebapp.business.ShoppingCartService;
import com.zs.shoppingwebapp.model.ShoppingCart;


@CrossOrigin
@RestController
@RequestMapping(value = "/carts")
public class ShoppingCartController {
	
	@Autowired
	private final ShoppingCartService shoppingCartService;
	
	public ShoppingCartController(ShoppingCartService shoppingCartService) {
		this.shoppingCartService = shoppingCartService;
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<ShoppingCart> getAll() {
		return shoppingCartService.findAll();
	}
	
	@RequestMapping(value = "/id", method=RequestMethod.POST)
	public Optional<ShoppingCart> viewById(@RequestBody Map<String, String> json) {
		String _id = json.get("_id");
		return shoppingCartService.findById(_id);
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ShoppingCart save(@RequestBody ShoppingCart shoppingCart) {
		return shoppingCartService.save(shoppingCart);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public void deleteById(@RequestBody Map<String, String> json){
		String _id = json.get("_id");
		shoppingCartService.deleteById(_id);
	}

}
