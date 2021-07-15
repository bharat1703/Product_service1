package com.prasad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;

	@Column
	private String ProductName;

	@Column
	private int quantity;

	@Column
	private String brand;

	@Column
	private long price;

	@Column
	private String Expirydate;

	@Column
	private String Manufacterdate;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long id, String productName, int quantity, String brand, long price, String expirydate,
			String manufacterdate) {
		super();
		this.id = id;
		ProductName = productName;
		this.quantity = quantity;
		this.brand = brand;
		this.price = price;
		Expirydate = expirydate;
		Manufacterdate = manufacterdate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getExpirydate() {
		return Expirydate;
	}

	public void setExpirydate(String expirydate) {
		Expirydate = expirydate;
	}

	public String getManufacterdate() {
		return Manufacterdate;
	}

	public void setManufacterdate(String manufacterdate) {
		Manufacterdate = manufacterdate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", ProductName=" + ProductName + ", quantity=" + quantity + ", brand=" + brand
				+ ", price=" + price + ", Expirydate=" + Expirydate + ", Manufacterdate=" + Manufacterdate + "]";
	}

}
