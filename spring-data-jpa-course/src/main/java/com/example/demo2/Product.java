package com.example.demo2;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1,
            initialValue = 777

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    @Column(
            updatable = false
    )
    private Long productId;
    private String productName;
    private Double productPrice;


    public Product(String productName, Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public Product(){

    }

    public Long getProductId() {
        return this.productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

}
