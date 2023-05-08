package com.inventoryapp.productservice;

import com.inventoryapp.productservice.products.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public void createProduct(ProductRequest request) {
        Product product = Product.builder()
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .build();
        productRepository.save(product);
    }

    public List<ProductResponse> getAllProducts() {
       List<Product>products= productRepository.findAll();
        List<ProductResponse> list = new ArrayList<>();
        for (Product product : products) {
            ProductResponse productResponse = mapToAProductResponse(product);
            list.add(productResponse);
        }
        return list;
    }

    private ProductResponse mapToAProductResponse(Product product) {
    return ProductResponse.builder()
            .id(product.getId())
            .name(product.getName())
            .description(product.getDescription())
            .price(product.getPrice())
            .build();
    }
}
