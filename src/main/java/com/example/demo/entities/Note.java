package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Note implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_note", nullable = false)
    private Long idNote;

    @Column(length = 100)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="SA")
    private StaffAdministratif SA;

    @OneToMany(mappedBy = "note",fetch=FetchType.LAZY)
    private Set<Reclamation> reclamations;

    @ManyToOne()
    @JoinColumn(name="matiere")
    private Matiere matiere;

    @ManyToOne()
    @JoinColumn(name="etudiant")
    private Etudiant etudiant;

    @ManyToOne()
    @JoinColumn(name="enseingant")
    private Enseignant enseingant;

    public Note() {

    }

    public Note(String name, Matiere matiere, Enseignant enseingant, Etudiant etudiant) {
        this.name = name;
        this.matiere = matiere;
        this.enseingant = enseingant;
        this.etudiant = etudiant;
    }

    public Note(String name ) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Enseignant getEnseignant() {
        return enseingant;
    }

    public void setEnseignant(Enseignant enseingant) {
        this.enseingant = enseingant;
    }

    public Set<Reclamation> getReclamations() {
        return reclamations;
    }

    public void setReclamations(Set<Reclamation> reclamations) {
        this.reclamations = reclamations;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Enseignant getEnseingant() {
        return enseingant;
    }

    public void setEnseingant(Enseignant enseingant) {
        this.enseingant = enseingant;
    }
}
//Constructors

//Getters and Setters
