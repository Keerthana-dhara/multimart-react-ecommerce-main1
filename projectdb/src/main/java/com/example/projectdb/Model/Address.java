package com.example.projectdb.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id",nullable = false)
private Long id;

@Column(name = "address_line_1",length = 512)
private String addressLine1;

@Column(name = "address_line_2",length = 512)
private String addressLine2;

@Column(name = "city",nullable = false)
private String city;

@Column(name = "country",nullable = false, length = 75)
private String country;

@JsonIgnore
@ManyToOne(optional = false)
@JoinColumn(name = "user_id",nullable = false)
private LocalUser localUser;

public LocalUser getLocalUser(){
    return localUser;
}

public void setLocalUser(LocalUser localUser){
    this.localUser=localUser;
}

  /**
   * Gets the country.
   * @return The country.
   */
  public String getCountry() {
    return country;
  }

  /**
   * Sets the country.
   * @param country The country to be set.
   */
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Gets the city.
   * @return The city.
   */
  public String getCity() {
    return city;
  }

  /**
   * Sets the city.
   * @param city The city to be set.
   */
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Gets the Address Line 2.
   * @return The second line of the address.
   */
  public String getAddressLine2() {
    return addressLine2;
  }

  /**
   * Sets the second line of address.
   * @param addressLine2 The second line of address.
   */
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  /**
   * Gets the Address Line 1.
   * @return The first line of the address.
   */
  public String getAddressLine1() {
    return addressLine1;
  }

  /**
   * Sets the first line of address.
   * @param addressLine1 The first line of address.
   */
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  /**
   * Gets the ID of the address.
   * @return The ID.
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets the ID of the address.
   * @param id The ID.
   */
  public void setId(Long id) {
    this.id = id;
  }

}
