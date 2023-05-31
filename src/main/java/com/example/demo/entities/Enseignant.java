package com.example.demo.entities;

import com.example.demo.entities.enums.Grade;
import com.example.demo.entities.enums.Sexe;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

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
    @JsonManagedReference
    private Set<Voeux> voeux;
    @OneToMany(mappedBy = "enseignant",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<EnseignantMatiere> enseignantMatiere ;


    @OneToMany(mappedBy = "enseingant",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<Note> notes;


    @Column
    private float NombreHeures;

    @Column
    private Grade gradeEnseignant ;


    @ElementCollection
    private ArrayList<LocalDate> notAvailable;


    public Enseignant() {

    }

    public Enseignant(Department department, Set<DemandeConger> demandeConger, Set<DemandeStockable> demandeStockable,Set<Service> services, ArrayList<LocalDate> notAvailable, String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire, Set<Voeux> voeux, Set<EnseignantMatiere> enseignantMatiere, Set<Note> notes, float nombreHeures, Grade gradeEnseignant) {
        super(department, demandeConger, demandeStockable, services, cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age, DateEmbauche, NbJourCongeTotale, NbJourCongeRestant, Salaire);
        this.voeux = voeux;
        this.enseignantMatiere = enseignantMatiere;
        this.notes = notes;
        this.NombreHeures = nombreHeures;
        this.gradeEnseignant = gradeEnseignant;
        this.notAvailable = notAvailable;
    }

    public Enseignant(Department department, Set<DemandeConger> demandeConger, Set<DemandeStockable> demandeStockable,Set<Service> services, String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire, Set<Voeux> voeux, Set<EnseignantMatiere> enseignantMatiere, Set<Note> notes, float nombreHeures, Grade gradeEnseignant) {
        super(department, demandeConger, demandeStockable, services, cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age, DateEmbauche, NbJourCongeTotale, NbJourCongeRestant, Salaire);
        this.voeux = voeux;
        this.enseignantMatiere = enseignantMatiere;
        this.notes = notes;
        this.NombreHeures = nombreHeures;
        this.gradeEnseignant = gradeEnseignant;

    }

    @Builder
    public Enseignant(Department department, Set<DemandeConger> demandeConger, Set<DemandeStockable> demandeStockable,Set<Service> services, String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire, float nombreHeures, Grade gradeEnseignant) {
        super(department, demandeConger, demandeStockable,services, cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age, DateEmbauche, NbJourCongeTotale, NbJourCongeRestant, Salaire);
        this.NombreHeures = nombreHeures;
        this.gradeEnseignant = gradeEnseignant;
        this.voeux = new HashSet<Voeux>();
        this.enseignantMatiere = new HashSet<EnseignantMatiere>();
        this.notes = new HashSet<Note>();
        this.notAvailable  = new ArrayList<LocalDate>();
    }

    public Enseignant(Department department, String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire, Set<Voeux> voeux, Set<EnseignantMatiere> enseignantMatiere, Set<Note> notes, float nombreHeures, Grade gradeEnseignant) {
        super(department, cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age, DateEmbauche, NbJourCongeTotale, NbJourCongeRestant, Salaire);
        this.voeux = voeux;
        this.enseignantMatiere = enseignantMatiere;
        this.notes = notes;
        this.NombreHeures = nombreHeures;
        this.gradeEnseignant = gradeEnseignant;
    }



    public Enseignant(Department department, String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire, float nombreHeures, Grade gradeEnseignant) {
        super(department, cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age, DateEmbauche, NbJourCongeTotale, NbJourCongeRestant, Salaire);
        this.NombreHeures = nombreHeures;
        this.gradeEnseignant = gradeEnseignant;
        this.voeux = new HashSet<Voeux>();
        this.enseignantMatiere = new HashSet<EnseignantMatiere>();
        this.notes = new HashSet<Note>();
    }


    /*****************************************************/
    public Enseignant(String nom) {
        super(  nom );

        this.voeux = new HashSet<Voeux>();
        this.enseignantMatiere = new HashSet<EnseignantMatiere>();
        this.notes = new HashSet<Note>();
    }
    /*****************************************************/



    public Set<Voeux> getVoeux() {
        return voeux;
    }

    public void setVoeux(Set<Voeux> voeux) {
        this.voeux = voeux;
    }


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
        enseignantMatiere.setEnseignant(this);
    }

    public void addNote(Note note) {
        this.notes.add(note);
        //note.setEnseignant(this);
    }

    public void addNotAvailable(LocalDate  dt) {
        this.notAvailable.add(dt);
        //note.setEnseignant(this);
    }


}
