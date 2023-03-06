package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Etudiant extends Personne {
    @Id
    @GeneratedValue
    @Column(name = "id_etudiant", nullable = false)
    private Long idEtudiant;

    @OneToMany(mappedBy = "etudiant",fetch=FetchType.LAZY)
    private Set<Note> notes;

    public Etudiant(String name, String prenom, int age, String adresse, Set<Note> notes) {
        super(name, prenom, age, adresse);
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
