package com.project.Findmine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Findmine.entities.Item;
import com.project.Findmine.entities.User;
import com.project.Findmine.repository.FindMineRepository;
import com.project.Findmine.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FindMineController {


@Autowired
UserService userService;

@Autowired
FindMineRepository repository;

@PostMapping("/create")
public User create(@RequestBody User user){
	userService.saveUser(user);
    return user;
}
@PostMapping("/loginUser")
public User loginUser(@RequestBody User user) {	
	User userdata=repository.findByEmailAndPassword(user.email,user.password);	
	if(userdata!=null)
		return userdata;
	else
		return null;			
}

@PostMapping("/PostItems")
public String post(@RequestBody Item item) {
	userService.saveItem(item);
    return "Post item successfully";
}



@PostMapping("/update")
public String update(@RequestBody User user) {
	userService.saveUser(user);
    return "Post updated successfully";
}

@GetMapping("/list")
public String list(@RequestBody User user) {
	userService.saveUser(user);
    return "Listed the post";
}

@GetMapping("/listbyid")
public String listById(@RequestBody User user) {
	userService.saveUser(user);
    return "Listed by id";
}

@DeleteMapping("/delete")
public String delete(@RequestBody User user) {
	userService.saveUser(user);
    return "Post has been deleted";
}

}
