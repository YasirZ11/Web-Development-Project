package com.project.Findmine.repository;

import com.project.Findmine.model.FindMine;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FindMineRepository extends CrudRepository<FindMine,Integer> {

}
