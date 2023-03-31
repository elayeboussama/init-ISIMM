package com.example.demo.gestionConge.exempleEntity;


import lombok.AllArgsConstructor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Doa.DemandeCongerRepository;
import com.example.demo.entities.DemandeConger;
import com.example.demo.entities.Employer;
import com.example.demo.entities.Enseignant;
import com.example.demo.entities.StaffAdministratif;



@Service
@AllArgsConstructor
public class CongeEntityServices {
	
	@Autowired
	private  DemandeCongerRepository demandeCongerRepository;
	
    public DemandeConger addDemande(@RequestBody DemandeConger c){
    	
        if (c == null || c.getDateDebut() == null || c.getDateFin() == null || c.getJustification() == null || c.getType() ==null || c.getTypecongé()==null) {
            throw new IllegalArgumentException("La demande est invalide");
        }

        if (c.getDateDebut().after(c.getDateFin())) {
            throw new IllegalArgumentException("La date de début doit être avant la date de fin");
        }
       
        Employer employer = c.getEmployer();
        
        long differenceMillis = Math.abs(c.getDateFin().getTime() - c.getDateDebut().getTime());

     
        long nbJoursDemande = TimeUnit.DAYS.convert(differenceMillis, TimeUnit.MILLISECONDS);
        
        if(employer.getNbJourCongeRestant() <nbJoursDemande) {
        	 throw new IllegalArgumentException("Nombre de Jours demande est superieure a celui de jours restants ");
        }
        
        if(employer instanceof Enseignant) {
        	
        	
        	
        }
        if(employer instanceof StaffAdministratif) {
        	
        	
        }
        
        employer.addDemandeConger(c);
    	
    	return demandeCongerRepository.save(c);
    }
    
    
    public List<DemandeConger> GetAllDemande(){
    	
		return demandeCongerRepository.findAll();
	}

    public DemandeConger updateDemande(@RequestBody DemandeConger c ,@PathVariable Long idDemandeConger ){
    	
		 return demandeCongerRepository.findById(idDemandeConger).map(conge ->{
			c.setType(c.getType());
			c.setTypecongé(c.getTypecongé());
			c.setJustification(c.getJustification());
			c.setDateDebut(c.getDateDebut());
			c.setDateFin(c.getDateFin());
			//c.setEtatDemande(c.getEtatDemande());
			//c.setEmployer(c.getEmployer());
			
			return conge;
			
		}).orElseThrow(() -> new ResourceNotFoundException("Demande not exist with id: " + idDemandeConger) );}
	
    
    public String deleteDemande(@PathVariable Long idDemandeConger){
		if(! demandeCongerRepository.existsById(idDemandeConger)) {
			return "Demande not exist with id: " + idDemandeConger;
		}
		demandeCongerRepository.deleteById(idDemandeConger);
		return "Demande deleted with success !";	
    	
		}

}
