package com.rams.eCommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="shaipping_address")
@Setter
@Getter
public class ShippingAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shippingId;
    private String houseNo;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    
    @ManyToOne
    @JoinColumn(name="customerId")
    private int customerId;
    
}
