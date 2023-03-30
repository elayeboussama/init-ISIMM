package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class Voeux implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_voeux", nullable = false)
    private Long idVoeux;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String message;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="id_SA")
//    private StaffAdministratif SA;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_enseignant")
    @JsonBackReference
    private Enseignant enseignant;



    public Voeux() {

    }

    public Voeux(String name,String message, Enseignant enseignant) {
        this.name = name;
        this.message = message;
        this.enseignant = enseignant;
    }


}

