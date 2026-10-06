package io.smartcommerce.platform.product.service;

import io.smartcommerce.platform.product.model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    private final ProductService productService = new ProductService();

    @Test
    void getListOfProducts() {
      List<Product> productList = productService.getListOfProducts();
      assertNotNull(productList);
      assertEquals(2, productList.size());
      assertEquals("TV", productList.get(0).getProductName());
    }
}