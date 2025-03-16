package com.middlleware_inventory.middlleware_inventory.mapper;

import com.middlleware_inventory.middlleware_inventory.dto.product.ProductRxDTO;
import com.middlleware_inventory.middlleware_inventory.dto.product.ProductTxDTO;
import com.middlleware_inventory.middlleware_inventory.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "currency", source = "currency")
    @Mapping(target = "alcoholContent", source = "alcoholContent")
    @Mapping(target = "volumeMl", source = "volumeMl")
    @Mapping(target = "available", source = "available")
    @Mapping(target = "quantity", source = "quantity")
    @Mapping(target = "imageUrl", source = "imageUrl")
    @Mapping(target = "createdAt", ignore = true)
    Product map(ProductRxDTO productRxDTO);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "currency", source = "currency")
    @Mapping(target = "alcoholContent", source = "alcoholContent")
    @Mapping(target = "volumeMl", source = "volumeMl")
    @Mapping(target = "available", source = "available")
    @Mapping(target = "quantity", source = "quantity")
    @Mapping(target = "imageUrl", source = "imageUrl")
    @Mapping(target = "createdAt", source = "createdAt")
    ProductTxDTO mapToTxDTO(Product product);
}
