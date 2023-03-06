package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity

public class Enseignant extends Employer  {

    @Id
    @GeneratedValue
    @Column(name = "id_enseignant", nullable = false)
    private Long idEnseignant;

    @Column(length = 100)
    private String name;

    @OneToMany(mappedBy="enseignant",fetch=FetchType.LAZY)
    private Set<Voeux> voeux;

    @OneToMany(mappedBy="enseignant",fetch=FetchType.LAZY)
    private Set<Matiere> matieres;


    @OneToMany(mappedBy = "enseingant",fetch=FetchType.LAZY)
    private Set<Note> notes;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="department")
    private Department department;

    @OneToMany(mappedBy = "enseignant",fetch=FetchType.LAZY)
    private Set<DemandeConger> demandeConger;

    @ManyToMany
    private Set<Service> services;


    public Enseignant() {

    }
    public Enseignant(Department department, Set<DemandeConger> demandeConger, Set<DemandeStockable> demandeStockable, String name, String prenom, int age, String adresse) {
        super(department, demandeConger, demandeStockable, name, prenom, age, adresse);

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Voeux> getVoeux() {
        return voeux;
    }

    public void setVoeux(Set<Voeux> voeux) {
        this.voeux = voeux;
    }

    public Set<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(Set<Matiere> matieres) {
        this.matieres = matieres;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }



    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }
}
//Constructors

//Getters and Setters
