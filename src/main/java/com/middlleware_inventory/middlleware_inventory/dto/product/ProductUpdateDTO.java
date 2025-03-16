package com.middlleware_inventory.middlleware_inventory.dto.product;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductUpdateDTO {

    @NotNull(message = "Product id must not be null")
    private UUID productId;

    @NotNull(message = "Quantity must not be null")
    private Integer quantity;
}
