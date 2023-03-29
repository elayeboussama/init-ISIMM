package com.example.demo.entities;

import com.example.demo.entities.enums.session;
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

    private session session;

    private groups groupType;

    private Long groupId;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Enseignant")
    public Enseignant getEnseignant() {
        return enseignant;
    }

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


    public com.example.demo.entities.enums.session getSession() {
        return session;
    }

    public void setSession(com.example.demo.entities.enums.session session) {
        this.session = session;
    }

    public groups getGroupType() {
        return groupType;
    }

    public void setGroupType(groups groupType) {
        this.groupType = groupType;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}

