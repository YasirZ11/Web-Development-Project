package com.project.Findmine.service;

import com.project.Findmine.model.FindMine;

import java.util.List;

public interface FindMineService {
    public FindMine saveFindMine (FindMine findMine);
    public FindMine updateFindmine(FindMine findMine);

    FindMine updateFindMine(FindMine findMine);

    public void deleteFindMine(FindMine findMine);

    public List<FindMine>getAllfindmines();
    public void getFindMineById(int id);

}
