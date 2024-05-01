package com.project.Findmine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Findmine.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
