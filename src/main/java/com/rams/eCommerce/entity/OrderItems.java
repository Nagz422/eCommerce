package com.rams.eCommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="orters_items")
@Setter
@Getter
public class OrderItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderItemId;
	
	private String imageURL;
	private double unitPrice;
	private int quantity;

	@OneToMany
	@JoinColumn(name="productId")
	private int productId;
	
	@OneToOne
	@JoinColumn(name="orderId")
	private int orderId;
}
