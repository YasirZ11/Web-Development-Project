package com.project.Findmine.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="user")
public class User {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int user_id;
	@Column(name="Username")
	private String username;
	@Column(name="Email")
	public String email;
	@Column(name="Contact")
	private long contact;
	@Column(name="Password")
	private String password;
	
	@OneToMany(targetEntity = Item.class, cascade= CascadeType.ALL)
	@JoinColumn(name ="u_userid",referencedColumnName = "user_id")
	private List<Item> item;
	
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
	