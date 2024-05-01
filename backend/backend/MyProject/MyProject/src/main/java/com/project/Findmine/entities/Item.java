package com.project.Findmine.entities;


import java.sql.Blob;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
	@Entity
	@Table(name="item_details")
	
	public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int item_id;
	@Column(name="Title")
	private String title;
	@Column(name="Description")
	private String description;
	@Column(name="Location")
	private String location;
	@Column(name="Image")
	private Blob image;
	@Column(name="Category")
	private String category;	
    @JsonFormat(pattern= "YYYY-MM-DD" , shape=Shape.STRING)
    @Column(name="Date")
    private Date date;
    private int u_userid;
	
	public int getU_userid() {
		return u_userid;
	}
	public void setU_userid(int u_userid) {
		this.u_userid = u_userid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	


}
