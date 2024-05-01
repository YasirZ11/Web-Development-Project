package com.project.Findmine.controller;

import com.project.Findmine.model.FindMine;
import com.project.Findmine.repository.FindMineRepository;
import com.project.Findmine.service.FindMineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class FindMineController {
@Autowired
    FindMineService findMineService;
@Autowired
    FindMineRepository repository;

    @PostMapping("/Create")
    public String create(@RequestBody FindMine findMine){
        findMineService.saveFindMine(findMine);
        return "New post added successfully";
    }

    @PostMapping("/Update")
    public String update(@RequestBody FindMine findMine) {
        findMineService.saveFindMine(findMine);
        return "Post updated successfully";
    }

    @GetMapping("/List")
    public String list(@RequestBody FindMine findMine) {
        findMineService.saveFindMine(findMine);
        return "Listed the post";
    }

    @GetMapping("/ListById")
    public String listById(@RequestBody FindMine findMine) {
        findMineService.saveFindMine(findMine);
        return "Listed by id";
    }

    @DeleteMapping("/Delete")
    public String delete(@RequestBody FindMine findMine) {
        findMineService.saveFindMine(findMine);
        return "Post has been deleted";
    }



}
