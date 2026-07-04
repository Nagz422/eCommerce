package com.rams.eCommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="customer")
@Setter
@Getter
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	private String customerName;
	
	@Column(nullable = false, unique = true)
	private String customerEmail;
	private String pwd;
	private String customerPhno;
	private String updatedPwd;
}
