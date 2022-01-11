package com.domain.models.repos;

import java.util.List;

import com.domain.models.entities.product;
import com.domain.services.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<product, Long>{

    Product save(Product product);

    List<Product> findNameContains(String name);
    
}
