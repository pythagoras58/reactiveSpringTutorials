package com.example.reactivespringtutorials.Service;

import com.example.reactivespringtutorials.Model.Product;
import com.example.reactivespringtutorials.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class ProductService {

    @Autowired
    private  ProductRepository productRepository;

    public Flux<Product> getAllProducts(){
        var allProducts = productRepository.findAll().delayElements(Duration.ofSeconds(5));
        return allProducts;
    }

    public Mono<Product> getProductById(int id){
        var byId = productRepository.findById(id);
        return byId;
    }
}
