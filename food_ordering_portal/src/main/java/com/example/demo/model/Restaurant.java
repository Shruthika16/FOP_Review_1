package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Restaurant {
	
	@Id
	private int restaurantId;
	private String restaurantName;
	private String cuisineType;
	private String location;
	private long contactNumber;
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurant(int restaurantId, String restaurantName, String cuisineType, String location,
			long contactNumber) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.cuisineType = cuisineType;
		this.location = location;
		this.contactNumber = contactNumber;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getCuisineType() {
		return cuisineType;
	}
	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
}
