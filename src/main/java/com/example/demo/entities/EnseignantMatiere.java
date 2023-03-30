package com.example.demo.entities;

import com.example.demo.entities.enums.Groups;
import com.example.demo.entities.enums.Session;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "Enseignants_Matieres")
@Getter
@Setter
public class EnseignantMatiere implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_Enseignant_Matiere", nullable = false)
    private Long idEnseignantMatiere;
    private Enseignant enseignant ;
    private Matiere  matiere;

    private Session session;

    private Groups groupType;

    private Long groupId;

    public EnseignantMatiere(Enseignant enseignant, Matiere matiere, Session session, Groups groupType, Long groupId) {
        this.enseignant = enseignant;
        this.matiere = matiere;
        this.session = session;
        this.groupType = groupType;
        this.groupId = groupId;
    }

    public EnseignantMatiere() {

    }
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Enseignant")
    public Enseignant getEnseignant() {
        return enseignant;
    }
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    public Matiere getMatiere() {
        return matiere;
    }

    public Long getIdEnseignantMatiere() {
        return idEnseignantMatiere;
    }

    public void setIdEnseignantMatiere(Long idEnseignantMatiere) {
        this.idEnseignantMatiere = idEnseignantMatiere;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }


    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Groups getGroupType() {
        return groupType;
    }

    public void setGroupType(Groups groupType) {
        this.groupType = groupType;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}

