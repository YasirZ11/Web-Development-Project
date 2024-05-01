package com.project.Findmine.service;


import com.project.Findmine.dao.Userdao;
import com.project.Findmine.entities.Item;
import com.project.Findmine.entities.User;

import antlr.collections.List;

public interface UserService {
	public User saveUser (User user);
    public User updateUser(User user);
    
    public void deleteUser(User user);

    public List<User>getAlluser();
	public void getItemByLocation(Item location);
	public void saveItem(Item item);



}
