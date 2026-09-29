package io.smartcommerce.platform.product.service;

import io.smartcommerce.platform.product.model.Product;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductService {


    public List<Product> getListOfProducts(){
        Product product1 =  Product.builder().productId(100)
                .productCode("Prod1")
                .productName("TV")
                .productPrice(10000)
                .createdDate(LocalDate.now())
                .updatedDate(null)
                .build();
        Product product2 =  Product.builder().productId(101)
                .productCode("Prod2")
                .productName("Washing Machine")
                .productPrice(20000)
                .createdDate(LocalDate.now())
                .updatedDate(null)
                .build();
        List<Product> productList = List.of(product1, product2);
        return productList;
    }
}
