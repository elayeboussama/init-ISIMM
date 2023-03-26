package com.example.demo.distributionCharge.enseignant;

import com.example.demo.entities.Enseignant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/isimm/distributionCharge/enseignant")

public class ChargeEnseignantController {

    private final ChargeEnseignantServices enseignantService;

    @Autowired
    public ChargeEnseignantController(ChargeEnseignantServices enseignantService){
        this.enseignantService=enseignantService;
    }

    @GetMapping(path="{enseignantId}")
    public Enseignant getEnseignant(@PathVariable("enseignantId") Long userId){
        return enseignantService.getEnseignant(userId);
    }
    @GetMapping
    public List<Enseignant> getEnseignants(){
        return enseignantService.getEnseignants();
    }

    @PostMapping
    public void registerNewEnseignant(@RequestBody Enseignant enseignant){
        enseignantService.signupEnseignant(enseignant);
    }

    @DeleteMapping(path="{enseignantId}")
    public void deleteUser(@PathVariable("enseignantId") Long enseignantId){
        enseignantService.deleteEnseignant(enseignantId);
    }

    @PutMapping(path ="{enseignantId}")
    public void updateUser(
            @PathVariable("enseignantId") Long enseignantId,
            @RequestParam(required=false) String phone,
            @RequestParam(required=false) String email){
        enseignantService.updateEnseignant(enseignantId,phone,email);
    }

}
