package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Enseignant")
public class Enseignant extends Employer  {

//    @Id
//    @GeneratedValue
//    @Column(name = "id_enseignant", nullable = false)
//    private Long idEnseignant;

    @OneToMany(mappedBy="enseignant",fetch=FetchType.LAZY)
    private Set<Voeux> voeux;

    @OneToMany(mappedBy="enseignant",fetch=FetchType.LAZY)
    private Set<Matiere> matieres;


    @OneToMany(mappedBy = "enseingant",fetch=FetchType.LAZY)
    private Set<Note> notes;

    public enum Grade{MAITRE, ASSISTANT,PROF }

    private float NombreHeur;
    private String NiveauEnseigné;
    private Grade grade ;


    public Enseignant() {

    }
    public Enseignant(float NombreHeur, String NiveauEnseigné, Grade grade , Department department, Set<DemandeConger> demandeConger, Set<DemandeStockable> demandeStockable, String cin, String nom, String prénom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire) {
        super(department, demandeConger, demandeStockable, cin, nom, prénom, naissance, sexe, adresse, password, email, telephone, age, DateEmbauche, NbJourCongeTotale, NbJourCongeRestant, Salaire);
        this.NombreHeur = NombreHeur;
        this.NiveauEnseigné = NiveauEnseigné;
        this.grade = grade;
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


}
//Constructors

//Getters and Setters
