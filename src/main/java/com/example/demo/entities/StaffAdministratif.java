package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
public class StaffAdministratif   extends Employer {

    @Id
    @GeneratedValue
    @Column(name = "id_staff_administratif", nullable = false)
    private Long idStaffAdministratif;

    public enum Type{OUVRIER, AGENT}
    private Type typeEmployer;
    public StaffAdministratif() {

    }
    public StaffAdministratif(Department department, Set<DemandeConger> demandeConger, Set<DemandeStockable> demandeStockable, String cin, String nom, String prénom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire, Type typeEmployer) {
        super(department, demandeConger, demandeStockable, cin, nom, prénom, naissance, sexe, adresse, password, email, telephone, age, DateEmbauche, NbJourCongeTotale, NbJourCongeRestant, Salaire);
        this.typeEmployer =typeEmployer;
    }





}
//Constructors

//Getters and Setters
