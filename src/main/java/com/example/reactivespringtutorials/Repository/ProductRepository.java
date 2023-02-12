package com.example.reactivespringtutorials.Repository;

import com.example.reactivespringtutorials.Model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product,Integer> {

}
