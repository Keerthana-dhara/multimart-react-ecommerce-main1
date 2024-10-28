package com.example.projectdb.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
@AllArgsConstructor
@Component
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id",nullable = false)
private Long id;

@Column(name = "category")
private String category;

@Column(name = "short_description",nullable = false)
private String shortDescription;

@Column(name = "long_description",nullable = false)
private String longDescription;

@Column(name = "price",nullable = false)
private Double price;

@OneToOne(mappedBy = "product",cascade = CascadeType.REMOVE,optional = false,orphanRemoval =true )
private Inventory inventory;

public Inventory getInventory(){
    return inventory;
}

public void setInventory(Inventory inventory){
    this.inventory=inventory;
}

/**
   * Gets the price of the product.
   * @return The price.
   */
  public Double getPrice() {
    return price;
  }

  /**
   * Sets the price of the product.
   * @param price The price.
   */
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   * Gets the long description of the product.
   * @return The long description.
   */
  public String getLongDescription() {
    return longDescription;
  }

  /**
   * Sets the long description of the product.
   * @param longDescription The long description.
   */
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  /**
   * Gets the short description of the product.
   * @return The short description.
   */
  public String getShortDescription() {
    return shortDescription;
  }

  /**
   * Sets the short description of the product.
   * @param shortDescription The short description.
   */
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  /**
   * Gets the name of the product.
   * @return The name.
   */
  public String getCategory() {
    return category;
  }

  /**
   * Sets the name of the product.
   * @param name The name.
   */
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Gets the id of the product.
   * @return The id.
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets the id of the product.
   * @param id The id.
   */
  public void setId(Long id) {
    this.id = id;
  }

public Product(){

}

}
