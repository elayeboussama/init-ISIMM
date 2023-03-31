package com.example.demo.gestionConge.exempleEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entities.DemandeConger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RestController
@RequestMapping("api/isimm/gestionConge/exempleEntity")
public class CongeEntityController {
    private final CongeEntityServices entityService;

    @Autowired
    public CongeEntityController(CongeEntityServices entityService){
        this.entityService=entityService;
    }


	@PostMapping
    public DemandeConger addDemande(@RequestBody DemandeConger c){
    	
    	return entityService.addDemande(c);
    }

    @GetMapping
    public List<DemandeConger> GetAllDemande(){
    	
		return entityService.GetAllDemande();
	}

    @PutMapping
    public DemandeConger updateDemande(@RequestBody DemandeConger c ,@PathVariable Long idDemandeConger ){
    	
    	
		return entityService.updateDemande(c, idDemandeConger);}

    @DeleteMapping(path="{idDemandeConger}")
    public String deleteDemande(@PathVariable Long idDemandeConger){
    	
		return entityService.deleteDemande(idDemandeConger);}

}
