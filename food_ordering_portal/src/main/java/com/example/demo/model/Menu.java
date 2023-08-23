package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Menu {
	
	@Id
	private int itemId;
	private String itemName;
	private int price;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(int itemId, String itemName, int price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
