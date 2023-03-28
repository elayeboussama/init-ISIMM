package com.example.demo.entities;

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


    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_td")
    private TD td;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_tp")
    private TP tp;

    @OneToMany(mappedBy = "etudiant",fetch=FetchType.LAZY)
    private Set<Reclamation> reclamations = new HashSet<Reclamation>();;

    @OneToMany(mappedBy = "etudiant",fetch=FetchType.LAZY)
    private Set<Note> notes = new HashSet<Note>();

    public Etudiant(String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire, Set<Note> notes) {
        super(cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age);
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
