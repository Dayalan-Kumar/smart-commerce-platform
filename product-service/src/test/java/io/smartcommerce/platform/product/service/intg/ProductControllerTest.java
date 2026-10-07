package io.smartcommerce.platform.product.service.intg;

import com.jayway.jsonpath.JsonPath;
import io.smartcommerce.platform.product.controller.ProductController;
import io.smartcommerce.platform.product.model.Product;
import io.smartcommerce.platform.product.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    @MockitoBean
    ProductService productService;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getListOfProducts() throws Exception {
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

        when(productService.getListOfProducts())
                .thenReturn(productList);

        mockMvc.perform(get("/products/list"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].productName").value("TV"));

        verify(productService, times(1)).getListOfProducts();
    }


}
