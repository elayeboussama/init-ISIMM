package com.example.demo.entities;

import com.example.demo.entities.enums.Sexe;
import com.example.demo.entities.enums.TypeStaff;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name="StaffAdministratif")
@Getter
@Setter
public class StaffAdministratif extends Employer {

    private TypeStaff typeStaff;
    public StaffAdministratif() {}
    public StaffAdministratif(Department department, Set<DemandeConger> demandeConger, Set<DemandeStockable> demandeStockable, Set<Service> services, String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire, TypeStaff typeStaff) {
        super(department, demandeConger, demandeStockable,services, cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age, DateEmbauche, NbJourCongeTotale, NbJourCongeRestant, Salaire);
        this.typeStaff =typeStaff;
    }

}
