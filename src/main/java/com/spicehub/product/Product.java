package com.spicehub.product;

import java.math.BigDecimal;

public class Product 
{
	private int productID;
	
	private String productName;
	
	private String category;
	
	private BigDecimal price;
	
	private String brandName;
	
	private int quantity;

	public Product() 
	{
		
	}

	public Product(int productID, String productName, String category, BigDecimal price, String brandName,
			int quantity) 
	{
		this.productID = productID;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.brandName = brandName;
		this.quantity = quantity;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
