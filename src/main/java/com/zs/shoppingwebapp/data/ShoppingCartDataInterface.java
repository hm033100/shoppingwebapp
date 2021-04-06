package com.zs.shoppingwebapp.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zs.shoppingwebapp.model.ShoppingCart;

public interface ShoppingCartDataInterface extends MongoRepository<ShoppingCart, String> {}
