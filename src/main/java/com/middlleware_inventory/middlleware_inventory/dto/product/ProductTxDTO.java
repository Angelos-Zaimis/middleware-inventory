package com.middlleware_inventory.middlleware_inventory.dto.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductTxDTO {

    @NotNull(message = "Id must not be null")
    private UUID id;

    @NotBlank(message = "Name must not be blank")
    private String name;

    @NotBlank(message = "Description must not be blank")
    private String description;

    @NotBlank(message = "Category must not be blank")
    private String category;

    @NotNull(message = "Price must not be null")
    private Double price;

    @NotBlank(message = "Currency must not be blank")
    private String currency;

    @NotBlank(message = "Alcohol content must not be empty")
    private String alcoholContent;

    @NotBlank(message = "Volume ml must not be empty")
    private String volumeMl;

    @NotBlank(message = "Available must not be empty")
    private boolean available;

    @NotBlank(message = "Quantity must not be empty")
    private Integer quantity;

    @NotBlank(message = "Image url must not empty")
    private String imageUrl;

    @NotBlank(message = "Created at must not blank")
    private String createdAt;
}
