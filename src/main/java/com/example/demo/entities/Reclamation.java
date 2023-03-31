package com.example.demo.entities;

import com.example.demo.entities.enums.TypeDevoir;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class Reclamation implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_reclamation", nullable = false)
    private Long idReclamation;
    @JsonBackReference
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_etudiant", nullable = false)
    private Etudiant etudiant;


    @Column
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date creationDateTime;

    @Column
    private String message;

    @Column
    private String statut;

    @Column
    private int codeMatiere;

    @Column
    private TypeDevoir typeNote;



//    @ManyToOne()
//    @JoinColumn(name="id_note")
//    private Note note;

    public Reclamation() {

    }

    public Reclamation(Etudiant etudiant, Date creationDateTime, String message, String statut, int codeMatiere, TypeDevoir typeNote) {
        this.etudiant = etudiant;
        this.creationDateTime = creationDateTime;
        this.message = message;
        this.statut = statut;
        this.codeMatiere = codeMatiere;
        this.typeNote = typeNote;
    }

    public Reclamation(String message, String statut) {
//        this.note = note;
        this.message = message;
        this.statut = statut;
    }



}

