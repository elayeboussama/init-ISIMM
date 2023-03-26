package com.example.demo.gestionMagasin.exempleEntity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/isimm/gestionMagasin/exempleEntity")
public class MagasinEntityController {

    private final MagasinEntityServices entityService;

    @Autowired
    public MagasinEntityController(MagasinEntityServices entityService){
        this.entityService=entityService;
    }
}
