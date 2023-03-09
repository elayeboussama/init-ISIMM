package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Etudiant")
public class Etudiant extends Personne {


    @OneToMany(mappedBy = "etudiant",fetch=FetchType.LAZY)
    private Set<Note> notes;

    public Etudiant(String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire, Set<Note> notes) {
        super(cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age);
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
