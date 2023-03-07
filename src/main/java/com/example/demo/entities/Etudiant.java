package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class Etudiant extends Personne {
    @Id
    @GeneratedValue
    @Column(name = "id_etudiant", nullable = false)
    private Long idEtudiant;

    @OneToMany(mappedBy = "etudiant",fetch=FetchType.LAZY)
    private Set<Note> notes;

    public Etudiant(String cin, String nom, String prénom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire, Set<Note> notes) {
        super(cin, nom, prénom, naissance, sexe, adresse, password, email, telephone, age);
         this.notes = notes;
    }


    public Etudiant() {

    }


    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }


}
