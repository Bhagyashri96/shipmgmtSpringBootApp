package com.example.demo.pojo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String numberPlate;
	String brand;
	BigDecimal price;
	String fuleType;
	Boolean isDiscontinued;
	
	
	public Car() {
		super();
	}
	

	public Car(Integer id, String numberPlate, String brand, BigDecimal price, String fuleType,
			Boolean isDiscontinued) {
		super();
		this.id = id;
		this.numberPlate = numberPlate;
		this.brand = brand;
		this.price = price;
		this.fuleType = fuleType;
		this.isDiscontinued = isDiscontinued;
	}


	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getFuleType() {
		return fuleType;
	}
	public void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}
	public Boolean getIsDiscontinued() {
		return isDiscontinued;
	}
	public void setIsDiscontinued(Boolean isDiscontinued) {
		this.isDiscontinued = isDiscontinued;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", numberPlate=" + numberPlate + ", brand=" + brand + ", price=" + price
				+ ", fuleType=" + fuleType + ", isDiscontinued=" + isDiscontinued + "]";
	}
}
