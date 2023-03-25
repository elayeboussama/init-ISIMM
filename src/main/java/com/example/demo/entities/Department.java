package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Department implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_department", nullable = false)
    private Long idDepartment;

    @Column(length = 100)
    private String nom;


    private String NonDepartement;

    @OneToOne
    private Employer ChefDepartement;

    @OneToMany(mappedBy = "department",fetch=FetchType.LAZY)
    private Set<Employer> employers;


    @OneToMany(mappedBy = "department",fetch=FetchType.LAZY)
    private Set<Enseignant> enseignants;

    public Department() {

    }

    public Department(String name, Set<Employer> employers ) {
        this.nom = nom;
        this.employers = employers;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(Set<Employer> employers) {
        this.employers = employers;
    }

}
//Constructors

//Getters and Setters
