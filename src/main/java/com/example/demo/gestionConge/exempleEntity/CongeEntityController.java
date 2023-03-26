package com.example.demo.gestionConge.exempleEntity;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/isimm/gestionConge/exempleEntity")
public class CongeEntityController {
    private final CongeEntityServices entityService;

    @Autowired
    public CongeEntityController(CongeEntityServices entityService){
        this.entityService=entityService;
    }

}
