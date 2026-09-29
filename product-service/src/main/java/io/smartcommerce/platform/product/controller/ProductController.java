package io.smartcommerce.platform.product.controller;

import io.smartcommerce.platform.product.model.Product;
import io.smartcommerce.platform.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/list")
    public List<Product> getListOfProducts(){
        return productService.getListOfProducts();
    }



}
