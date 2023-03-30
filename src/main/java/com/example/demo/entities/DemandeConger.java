package com.example.demo.entities;

import com.example.demo.entities.enums.Cause;
import com.example.demo.entities.enums.Etat;
import com.example.demo.entities.enums.TypeCongé;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;


@Entity
@Getter
@Setter
public class DemandeConger implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_demande_conger", nullable = false)
    private Long idDemandeConger;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_employer")
    @JsonBackReference
    private Employer employer;


    private Cause type;
    private TypeCongé Typecongé;
    private String Justification;
    private Date DateDebut;
    private Date DateFin;
    private Etat etatDemande;

    public DemandeConger() {

    }

    public DemandeConger(Employer employer, Cause type, TypeCongé typecongé, String justification, Date dateDebut, Date dateFin, Etat etatDemande) {
        this.employer = employer;
        this.type = type;
        this.Typecongé = typecongé;
        this.Justification = justification;
        this.DateDebut = dateDebut;
        this.DateFin = dateFin;
        this.etatDemande = etatDemande;
    }


}
