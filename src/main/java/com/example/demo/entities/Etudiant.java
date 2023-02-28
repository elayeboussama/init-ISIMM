package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Etudiant    implements Serializable {
    @Id
    @GeneratedValue
    private Long idEtudiant;
    @Column(length = 100)
    private String name;
    @OneToMany(mappedBy = "etudiant",fetch=FetchType.LAZY)
    private Set<Note> notes;

    public Etudiant(String name, String prenom, int age, String adresse, Set<Note> notes) {

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
