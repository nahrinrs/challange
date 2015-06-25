package com.my.credits.core;

import java.math.BigDecimal;

public class Item {

	private int id;
	private String name;
	private String description;
	private int quantity;
	private ItemType itemType;
	private BigDecimal price;
	private BigDecimal salesTaxs;
	private boolean imported = false;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ItemType getItemType() {
		return itemType;
	}
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isImported() {
		return imported;
	}
	public void setImported(boolean imported) {
		this.imported = imported;
	}
	public BigDecimal getSalesTaxs() {
		return salesTaxs;
	}
	public void setSalesTaxs(BigDecimal salesTaxs) {
		this.salesTaxs = salesTaxs;
	}
	
	
}
