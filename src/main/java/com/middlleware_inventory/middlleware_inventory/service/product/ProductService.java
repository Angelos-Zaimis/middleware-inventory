package com.middlleware_inventory.middlleware_inventory.service.product;

import com.middlleware_inventory.middlleware_inventory.dto.product.ProductRxDTO;
import com.middlleware_inventory.middlleware_inventory.dto.product.ProductTxDTO;

public interface ProductService {

    ProductTxDTO createProduct(ProductRxDTO product);
}
