package com.project.Findmine.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Findmine.entities.Item;
import com.project.Findmine.entities.User;
import com.project.Findmine.repository.FindMineRepository;
import com.project.Findmine.repository.ItemRepository;
import com.project.Findmine.service.UserService;

@RestController
@RequestMapping("/post")
@CrossOrigin

public class postController {

	@Autowired
	ItemRepository repository;
	
	@Autowired
	FindMineRepository userrepository;
	
	@PostMapping("/PostItems")
	public String post(@RequestBody Item item) {
		item.setDate(new Date());
		
		repository.save(item);		
	    return "Post item successfully";
	}
	
}
