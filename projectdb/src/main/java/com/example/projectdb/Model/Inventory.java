package com.example.projectdb.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory")

public class Inventory {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id",nullable = false)
private Long id;

@Column(name = "quantity",nullable = false)
private Integer quantity;

@JsonIgnore
@OneToOne(optional = false,orphanRemoval = true)
@JoinColumn(name = "product_id",nullable = false,unique = true)
private Product product;

public Product getProduct(){
    return product;
}

public void setProduct(Product product){
this.product=product;
}

/**
   * Gets the ID of the inventory.
   * @return The ID.
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets the ID of the inventory.
   * @param id The ID.
   */
  public void setId(Long id) {
    this.id = id;
  }

   /**
   * Gets the quantity in stock.
   * @return The quantity.
   */
  public Integer getQuantity() {
    return quantity;
  }

  /**
   * Sets the quantity in stock of the product.
   * @param quantity The quantity to be set.
   */
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
}

