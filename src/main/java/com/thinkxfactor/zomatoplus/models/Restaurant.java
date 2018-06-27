package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_restaurant")
public class Restaurant implements Serializable {
	@Id
	@GeneratedValue
	@Column(name="restaurant_id")
	private Long id;
	private String city;
	@Column(name="name")
	private String name;
	@Column(name="address")
	String address;
	@Column(name="contact")
	private String contact;
	@Column(name="description")
	private String description;
	@Column(name="website")
	String website;
	@Column(name="likeCount")
	private Integer likeCount;
	public Restaurant() {}
	public Restaurant(Long id, String city, String name, String address, String contact, String description,
			String website, Integer likeCount) {
		super();
		this.id = id;
		this.city = city;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.description = description;
		this.website = website;
		this.likeCount = likeCount;
	}
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Integer getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", city=" + city + ", name=" + name + ", address=" + address + ", contact="
				+ contact + ", description=" + description + ", website=" + website + ", likeCount=" + likeCount + "]";
	}
}
