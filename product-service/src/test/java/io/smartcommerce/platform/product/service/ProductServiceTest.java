package io.smartcommerce.platform.product.service;

import io.smartcommerce.platform.product.model.Product;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class ProductServiceTest {

    @Mock
    Product product;

    @Test
    void getListOfProducts() {
      Product product1 =   Product.builder().productId(100)
                .productCode("Prod1")
                .productName("TV")
                .productPrice(10000)
                .createdDate(LocalDate.now())
                .updatedDate(null)
                .build();
      assertNotNull("Prod1", product1.getProductName());
      assertSame("TV", product1.getProductName());

    }
}