package com.middlleware_inventory.middlleware_inventory.service.product.impl;

import com.middlleware_inventory.middlleware_inventory.dto.product.ProductRxDTO;
import com.middlleware_inventory.middlleware_inventory.dto.product.ProductTxDTO;
import com.middlleware_inventory.middlleware_inventory.entity.Product;
import com.middlleware_inventory.middlleware_inventory.mapper.ProductMapper;
import com.middlleware_inventory.middlleware_inventory.repository.ProductRepository;
import com.middlleware_inventory.middlleware_inventory.service.product.ProductService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BarProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    @Override
    @Transactional
    public ProductTxDTO createProduct(ProductRxDTO product) {
        Product newProduct = productMapper.map(product);
        productRepository.save(newProduct);

        return productMapper.mapToTxDTO(newProduct);
    }

}
