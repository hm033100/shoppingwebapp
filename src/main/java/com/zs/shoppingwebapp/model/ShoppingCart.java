package com.zs.shoppingwebapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document(collection = "ShoppingCarts")
public class ShoppingCart {
	
	@Id
	private String _id;
	
	@NonNull
	private String totalPrice;
	
	@NonNull
	private String totalItems;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(String totalItems) {
		this.totalItems = totalItems;
	}

	public ShoppingCart(String _id, String totalPrice, String totalItems) {
		super();
		this._id = _id;
		this.totalPrice = totalPrice;
		this.totalItems = totalItems;
	}

	public ShoppingCart() {
		super();
	}
	
	

}
