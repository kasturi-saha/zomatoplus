package com.thinkxfactor.zomatoplus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_items")
public class Items {
	@Id
	@GeneratedValue
	@Column(name="item_id")
	private Long id;
	@Column(name="restaurant_id")
	private Long restaurantId;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private Double price;
	@Column(name="description")
	private String description;
	public Items() {}
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Items(Long id, Long restaurantId, String name, Double price, String description) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		this.name = name;
		this.price = price;
		this.description = description;
	}
}
