package com.project.Findmine.dao;

import java.util.Date;

import com.project.Findmine.entities.Item;
import com.project.Findmine.entities.User;

public class Findminedao {
		 private int post_id;
		 
		    private int admin_id;
		    private Item item;
		    private User user;
		    private int category_id;
			public int getPost_id() {
				return post_id;
			}
			public void setPost_id(int post_id) {
				this.post_id = post_id;
			}
		
			public int getAdmin_id() {
				return admin_id;
			}
			public void setAdmin_id(int admin_id) {
				this.admin_id = admin_id;
			}
		
			public Item getItem() {
				return item;
			}
			public void setItem(Item item) {
				this.item = item;
			}
			public User getUser() {
				return user;
			}
			public void setUser(User user) {
				this.user = user;
			}
			public int getCategory_id() {
				return category_id;
			}
			public void setCategory_id(int category_id) {
				this.category_id = category_id;
			}
}


