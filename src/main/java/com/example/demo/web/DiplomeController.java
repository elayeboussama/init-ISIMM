package com.example.demo.web;


import com.example.demo.Doa.DiplomeRepository;
import com.example.demo.entities.Diplome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiplomeController {

    @Autowired
    private DiplomeRepository diplomeDao;


    @PostMapping(value="/diplome/add")
    public Diplome add(@RequestBody Diplome diplome) {
        return  diplomeDao.save(diplome);
    }

    @GetMapping(value="/diplomes")
    public List<Diplome> getAllTeams() {
        List<Diplome> diplomes = diplomeDao.findAll();
        return diplomes;
    }


}

