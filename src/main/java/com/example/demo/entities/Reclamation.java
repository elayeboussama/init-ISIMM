package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Reclamation implements Serializable {

    @Id
    @GeneratedValue
    private Long idReclamation;

    @Column(length = 100)
    private String name;


    @ManyToOne()
    @JoinColumn(name="reclamations")
    private Note note;

    public Reclamation() {

    }

    public Reclamation(String name,Note note ) {
        this.name = name;
        this.note = note;
    }

    public Reclamation(String name ) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}
//Constructors

//Getters and Setters
