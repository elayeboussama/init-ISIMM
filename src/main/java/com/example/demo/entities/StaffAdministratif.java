package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;


@Entity
public class StaffAdministratif   extends Employer {

    @Id
    @GeneratedValue
    @Column(name = "id_staff_administratif", nullable = false)
    private Long idStaffAdministratif;

    @Column(length = 100)
    private String name;

    @OneToMany(mappedBy="SA",fetch=FetchType.LAZY)
    private Set<Voeux> voeux;

    @OneToMany(mappedBy="SA",fetch=FetchType.LAZY)
    private Set<Matiere> matieres;


    @OneToMany(mappedBy = "SA",fetch=FetchType.LAZY)
    private Set<Note> notes;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="department")
    private Department department;

    @OneToMany(mappedBy = "SA",fetch=FetchType.LAZY)
    private Set<DemandeConger> demandeConger;




    public StaffAdministratif() {

    }
    public StaffAdministratif(Department department, Set<DemandeConger> demandeConger, Set<DemandeStockable> demandeStockable, String name, String prenom, int age, String adresse) {
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
}
//Constructors

//Getters and Setters
