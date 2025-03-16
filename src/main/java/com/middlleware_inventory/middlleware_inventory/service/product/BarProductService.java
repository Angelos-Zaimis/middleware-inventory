package com.middlleware_inventory.middlleware_inventory.service.product;

import com.middlleware_inventory.middlleware_inventory.dto.product.ProductRxDTO;
import com.middlleware_inventory.middlleware_inventory.dto.product.ProductTxDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BarProductService {

    private final ProductService productService;

    public ProductTxDTO handleCreateProduct(ProductRxDTO product) {
        return productService.createProduct(product);
    }
}
