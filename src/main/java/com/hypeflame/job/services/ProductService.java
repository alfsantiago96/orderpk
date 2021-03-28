package com.hypeflame.job.services;

import com.hypeflame.job.entities.Product;
import com.hypeflame.job.entities.User;
import com.hypeflame.job.repositories.ProductRepository;
import com.hypeflame.job.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        List<Product> productList = productRepository.findAll();
        return productList;
    }
}
