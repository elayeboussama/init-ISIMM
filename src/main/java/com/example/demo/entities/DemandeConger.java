package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class DemandeConger implements Serializable {

    @Id
    @GeneratedValue
    private Long idSection;

    @Column(length = 100)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="employer")
    private Employer employer;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="enseignant")
    private Enseignant enseignant;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="SA")
    private StaffAdministratif SA;


    public DemandeConger() {

    }

    public DemandeConger(String name, Employer employer ) {
        this.name = name;
        this.employer = employer;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

}
//Constructors

//Getters and Setters
