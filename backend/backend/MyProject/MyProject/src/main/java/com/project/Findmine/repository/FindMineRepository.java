package com.project.Findmine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Findmine.entities.Item;
import com.project.Findmine.entities.User;

@Repository
public interface FindMineRepository extends JpaRepository<User, Integer> {

	
	User findByEmailAndPassword(String email, String password);

	
}
