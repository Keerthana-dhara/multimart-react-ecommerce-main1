package com.example.projectdb.Model;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "web_order")
@Data
@Component
@AllArgsConstructor
public class WebOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    private LocalUser localUser;

    @ManyToOne(optional = false)
    @JoinColumn(name = "address_id",nullable = false)
    private Address address;

    @OneToMany(mappedBy = "order",cascade = CascadeType.REMOVE,orphanRemoval = true)
    private List<WebOrderQuantities> quantities= new ArrayList<>();

    public List<WebOrderQuantities> getQuantities(){
        return quantities;
    }

    public void setQuantities(List<WebOrderQuantities> quantities){
        this.quantities=quantities;
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address=address;
    }

    public LocalUser setLocalUser(){
        return localUser;
    }

    public void getLocalUser(LocalUser localUser){
        this.localUser=localUser;
    }

public WebOrder(){

}
}

