package com.example.demo.entities;

import com.example.demo.entities.enums.Sexe;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Etudiant")
@Getter
@Setter
public class Etudiant extends Personne {

    @JsonBackReference
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_td")
    private TD td;
    @JsonBackReference
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_tp")
    private TP tp;

    @OneToMany(mappedBy = "etudiant",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<Reclamation> reclamations;

    @OneToMany(mappedBy = "etudiant",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<Note> notes;

    public Etudiant(String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, TD td, TP tp, Set<Note> notes, Set<Reclamation> reclamations) {
        super(cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age);
        this.td = td;
        this.tp = tp;
        this.notes = notes;
        this.reclamations = reclamations;
    }

    public Etudiant(String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, TD td, TP tp) {
        super(cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age);
        this.td = td;
        this.tp = tp;
        this.notes = new HashSet<Note>();
        this.reclamations = new HashSet<Reclamation>();
    }

    public Etudiant() {

    }


    public void addNote(Note note) {
        this.notes.add(note);
        //note.setEtudiant(this);
    }


    public void addReclamation(Reclamation reclamation) {
        this.reclamations.add(reclamation);
        //reclamation.setEtudiant(this);
    }



}
