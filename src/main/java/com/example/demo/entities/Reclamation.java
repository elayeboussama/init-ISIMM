package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Reclamation implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_reclamation", nullable = false)
    private Long idReclamation;



    @Column
    private String message;

    @Column
    private String statut;

    @ManyToOne()
    @JoinColumn(name="reclamations")
    private Note note;

    public Reclamation() {

    }

    public Reclamation(Note note, String message, String statut) {
        this.note = note;
        this.message = message;
        this.statut = statut;
    }


    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

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
