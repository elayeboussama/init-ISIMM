package com.example.demo.entities;

import com.example.demo.entities.enums.devoirTypes;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class Reclamation implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_reclamation", nullable = false)
    private Long idReclamation;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_etudiant", nullable = false)
    private Etudiant etudiant;

    @Column
    private String message;

    @Column
    private String statut;

    @Column
    private int codeMatiere;

    @Column
    private devoirTypes typeNote;



//    @ManyToOne()
//    @JoinColumn(name="id_note")
//    private Note note;

    public Reclamation() {

    }

    public Reclamation(String message, String statut) {
//        this.note = note;
        this.message = message;
        this.statut = statut;
    }


//    public Note getNote() {
//        return note;
//    }
//
//    public void setNote(Note note) {
//        this.note = note;
//    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
//Constructors

//Getters and Setters
