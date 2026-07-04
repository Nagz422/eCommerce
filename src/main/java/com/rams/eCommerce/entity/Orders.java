package com.rams.eCommerce.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
@Table(name="Orders")
@Setter
@Getter
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	private Long orderTrackingId;
	private int totalQuantity;
	private double totalPrice;
	private String orderStatus;
	
	@CreationTimestamp
	private LocalDate cretedDate;
	
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	@UpdateTimestamp
	private LocalDate deliveredDate;
	
	private String paymentStatus;
	
	private Long razorpayOrderId;
	private Long razorpayPaymentId;

	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customerId;
	
	@ManyToOne
	@JoinColumn(name="shippingId")
	private ShippingAddress addrId;
}
