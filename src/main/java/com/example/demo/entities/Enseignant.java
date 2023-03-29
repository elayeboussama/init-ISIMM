package com.example.demo.entities;

import com.example.demo.entities.enums.grade;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Enseignant")
@Getter
@Setter
public class Enseignant extends Employer  {

//    @Id
//    @GeneratedValue
//    @Column(name = "id_enseignant", nullable = false)
//    private Long idEnseignant;

    @OneToMany(mappedBy="enseignant",fetch=FetchType.LAZY)
    private Set<Voeux> voeux;

    private Set<EnseignantMatiere> enseignantMatiere = new HashSet<EnseignantMatiere>();


    @OneToMany(mappedBy = "enseingant",fetch=FetchType.LAZY)
    private Set<Note> notes;



    private float NombreHeures;

    private grade gradeEnseignant ;


    public Enseignant() {

    }


    public Enseignant(Department department, Set<DemandeConger> demandeConger, Set<DemandeStockable> demandeStockable, String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire, Set<Voeux> voeux, Set<EnseignantMatiere> enseignantMatiere, Set<Note> notes, float nombreHeures, grade gradeEnseignant) {
        super(department, demandeConger, demandeStockable, cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age, DateEmbauche, NbJourCongeTotale, NbJourCongeRestant, Salaire);
        this.voeux = voeux;
        this.enseignantMatiere = enseignantMatiere;
        this.notes = notes;
        this.NombreHeures = nombreHeures;
        this.gradeEnseignant = gradeEnseignant;
    }

    public Enseignant(Department department, Set<DemandeConger> demandeConger, Set<DemandeStockable> demandeStockable, String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire, float nombreHeures, grade gradeEnseignant) {
        super(department, demandeConger, demandeStockable, cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age, DateEmbauche, NbJourCongeTotale, NbJourCongeRestant, Salaire);
        this.NombreHeures = nombreHeures;
        this.gradeEnseignant = gradeEnseignant;
    }

    public Enseignant(Set<Voeux> voeux, Set<EnseignantMatiere> enseignantMatiere, Set<Note> notes, float nombreHeures, grade gradeEnseignant) {
        this.voeux = voeux;
        this.enseignantMatiere = enseignantMatiere;
        this.notes = notes;
        this.NombreHeures = nombreHeures;
        this.gradeEnseignant = gradeEnseignant;
    }

    public Set<Voeux> getVoeux() {
        return voeux;
    }

    public void setVoeux(Set<Voeux> voeux) {
        this.voeux = voeux;
    }

    @OneToMany(mappedBy = "enseignant")
    public Set<EnseignantMatiere> getEnseignantMatiere() {
        return enseignantMatiere;
    }

    public void setEnseignantMatiere(Set<EnseignantMatiere> enseignantMatiere) {
        this.enseignantMatiere = enseignantMatiere;
    }



    public void addVoeux(Voeux voeux) {
        this.voeux.add(voeux);
        //voeux.setEnseignant(this);
    }

    public void addEnseignantMatiere(EnseignantMatiere enseignantMatiere) {
        this.enseignantMatiere.add(enseignantMatiere);
        //enseignantMatiere.setEnseignant(this);
    }

    public void addNote(Note note) {
        this.notes.add(note);
        //note.setEnseignant(this);
    }


}
