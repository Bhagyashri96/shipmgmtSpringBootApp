package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Table(name = "OrderDetail")
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long orderId;
	
	String orderDescription;
	
	Long orderQuantity;
	
	BigDecimal orderAmount;
	
	Float discount;
	
	Date orderDate;
	
	Date payementDate;
	
	Boolean isPaymentSuccessful;
	
	@Enumerated(EnumType.ORDINAL)
	PaymentStatus paymentStatus ;

	Long shipId;
	
	public OrderDetails() {
		super();
	}

	public OrderDetails(Long orderId, String orderDescription, Long orderQuantity, BigDecimal orderAmount,
			Float discount, Date orderDate, Date payementDate, Boolean isPaymentSuccessful, PaymentStatus paymentStatus,
			Long shipId) {
		super();
		this.orderId = orderId;
		this.orderDescription = orderDescription;
		this.orderQuantity = orderQuantity;
		this.orderAmount = orderAmount;
		this.discount = discount;
		this.orderDate = orderDate;
		this.payementDate = payementDate;
		this.isPaymentSuccessful = isPaymentSuccessful;
		this.paymentStatus = paymentStatus;
		this.shipId = shipId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public Long getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Long orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getPayementDate() {
		return payementDate;
	}

	public void setPayementDate(Date payementDate) {
		this.payementDate = payementDate;
	}

	public Boolean getIsPaymentSuccessful() {
		return isPaymentSuccessful;
	}

	public void setIsPaymentSuccessful(Boolean isPaymentSuccessful) {
		this.isPaymentSuccessful = isPaymentSuccessful;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Long getShipId() {
		return shipId;
	}

	public void setShipId(Long shipId) {
		this.shipId = shipId;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", orderDescription=" + orderDescription + ", orderQuantity="
				+ orderQuantity + ", orderAmount=" + orderAmount + ", discount=" + discount + ", orderDate=" + orderDate
				+ ", payementDate=" + payementDate + ", isPaymentSuccessful=" + isPaymentSuccessful + ", paymentStatus="
				+ paymentStatus + ", shipId=" + shipId + "]";
	}

	

}
