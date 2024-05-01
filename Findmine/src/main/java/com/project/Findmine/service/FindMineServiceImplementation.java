package com.project.Findmine.service;

import com.project.Findmine.model.FindMine;
import com.project.Findmine.repository.FindMineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindMineServiceImplementation implements FindMineService{

    @Autowired
    private FindMineRepository findMineRepository;

    @Override
    public FindMine saveFindMine(FindMine findMine){
    return findMineRepository.save(findMine);
    }

    @Override
    public FindMine updateFindmine(FindMine findMine) {
        return null;
    }

    @Override
    public FindMine updateFindMine(FindMine findMine){
        return findMineRepository.save(findMine);
    }

    @Override
    public void deleteFindMine(FindMine findMine){
        findMineRepository.delete(findMine);
    }

    @Override
    public void getFindMineById(int id){
        findMineRepository.findById(id).get();
    }

    @Override
    public List<FindMine> getAllfindmines(){
    return (List<FindMine>) findMineRepository.findAll();
    }

    public FindMineRepository getFindMineRepository() {
        return findMineRepository;
    }

    public void setFindMineRepository(FindMineRepository findMineRepository) {
        this.findMineRepository = findMineRepository;
    }
}
