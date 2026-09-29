package io.smartcommerce.platform.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Product {
    private int productId;
    private String productCode;
    private String productName;
    private double productPrice;
    private LocalDate createdDate;
    private LocalDate updatedDate;
}
