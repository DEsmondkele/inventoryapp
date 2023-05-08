package com.inventoryapp.productservice;

import com.inventoryapp.productservice.products.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class TestData implements CommandLineRunner {
    private final ProductRepository productRepository;
    @Override
    public void run(String... args) {
        if(productRepository.count()<1){
            Product product = new Product();
            product.setName("");
            product.setDescription("");
            product.setPrice(BigDecimal.valueOf(40.0));
            productRepository.save(product);
        }

    }
}
