package com.zs.shoppingwebapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document(collection = "Products")
public class Product {
	
	@Id
	private String _id;
	
	@NonNull
	private String shoppingCartId;
	
	@NonNull
	private String productName;
	
	@NonNull
	private String productDescription;
	
	@NonNull
	private String productPrice;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getShoppingCartId() {
		return shoppingCartId;
	}

	public void setShoppingCartId(String shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public Product(String _id, String shoppingCartId, String productName, String productDescription,
			String productPrice) {
		super();
		this._id = _id;
		this.shoppingCartId = shoppingCartId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}

	public Product() {
		super();
	}
	
	

}
