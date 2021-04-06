package com.zs.shoppingwebapp.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.zs.shoppingwebapp.model.Product;

public interface ProductDataInterface extends MongoRepository<Product, String> {}
