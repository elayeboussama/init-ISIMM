package com.example.demo.entities;

import com.example.demo.entities.enums.devoirTypes;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class Note implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_note", nullable = false)
    private Long idNote;



//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="SA")
//    private StaffAdministratif SA;

//    @OneToMany(mappedBy = "note",fetch=FetchType.LAZY)
//    private Set<Reclamation> reclamations;

    @ManyToOne()
    @JoinColumn(name="id_matiere")
    private Matiere matiere;

    @ManyToOne()
    @JoinColumn(name="id_etudiant")
    private Etudiant etudiant;

    @ManyToOne()
    @JoinColumn(name="id_enseingant")
    private Enseignant enseingant;


    @Column
    private devoirTypes type;

private float note;
private Date date;
    public Note() {

    }

    public Note( Matiere matiere, Etudiant etudiant, Enseignant enseingant, devoirTypes type, float note, Date date) {
//        this.SA = SA;
//        this.reclamations = reclamations;
        this.matiere = matiere;
        this.etudiant = etudiant;
        this.enseingant = enseingant;
        this.type = type;
        this.note = note;
        this.date = date;
    }


//    public StaffAdministratif getSA() {
//        return SA;
//    }
//
//    public void setSA(StaffAdministratif SA) {
//        this.SA = SA;
//    }

//    public Set<Reclamation> getReclamations() {
//        return reclamations;
//    }
//
//    public void setReclamations(Set<Reclamation> reclamations) {
//        this.reclamations = reclamations;
//    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
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

    public devoirTypes getType() {
        return type;
    }

    public void setType(devoirTypes type) {
        this.type = type;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
//Constructors

//Getters and Setters
