package com.inventoryapp.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
 @PostMapping
public void createProduct(ProductRequest request){
        productService.createProduct(request);
 }
@GetMapping("/get")
public List<ProductResponse> getAllProducts(){
    return productService.getAllProducts();
}

}
