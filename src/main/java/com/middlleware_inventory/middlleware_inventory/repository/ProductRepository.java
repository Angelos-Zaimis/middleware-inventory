package com.middlleware_inventory.middlleware_inventory.repository;

import com.middlleware_inventory.middlleware_inventory.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
