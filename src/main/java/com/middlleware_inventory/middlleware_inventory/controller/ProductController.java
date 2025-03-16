package com.middlleware_inventory.middlleware_inventory.controller;

import com.middlleware_inventory.middlleware_inventory.configuration.springdoc.SpringDocTags;
import com.middlleware_inventory.middlleware_inventory.dto.product.ProductRxDTO;
import com.middlleware_inventory.middlleware_inventory.dto.product.ProductTxDTO;
import com.middlleware_inventory.middlleware_inventory.service.product.BarProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Tag(name = SpringDocTags.INVENTORY)
@RequiredArgsConstructor
public class ProductController {

    private final BarProductService barProductService;

    @Operation(
            summary = "Creates a new product",
            description = "This endpoint creates a new product."
    )
    @PostMapping(produces = "application/json")
    @ApiResponse(responseCode = "200", description = "Order created successfully")
    private ResponseEntity<ProductTxDTO> createProduct(@RequestBody @Valid ProductRxDTO orderRxDTO) {
        ProductTxDTO productTxDTO = barProductService.handleCreateProduct(orderRxDTO);
        return ResponseEntity.ok(productTxDTO);
    }

}
