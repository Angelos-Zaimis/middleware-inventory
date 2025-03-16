package com.middlleware_inventory.middlleware_inventory.entity;

import com.middlleware_inventory.middlleware_inventory.enums.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private Category category;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "alcohol_content", nullable = false)
    private String alcoholContent;

    @Column(name = "volume_ml", nullable = false)
    private Integer volumeMl;

    @Column(name = "available", nullable = false)
    private boolean available;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}
