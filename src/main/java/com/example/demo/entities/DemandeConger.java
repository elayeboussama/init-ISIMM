package com.example.demo.entities;

import com.example.demo.entities.enums.cause;
import com.example.demo.entities.enums.etat;
import com.example.demo.entities.enums.typecongé;
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
    private Employer employer;


    private cause type;
    private typecongé Typecongé;
    private String Justification;
    private Date DateDebut;
    private Date DateFin;
    private etat EtatDemande;

    public DemandeConger() {

    }

    public DemandeConger( Employer employer, Enseignant enseignant, StaffAdministratif SA, cause type, typecongé typecongé, String justification, Date dateDebut, Date dateFin, etat etatDemande) {
        this.employer = employer;
        this.type = type;
        this.Typecongé = typecongé;
        this.Justification = justification;
        this.DateDebut = dateDebut;
        this.DateFin = dateFin;
        this.EtatDemande = etatDemande;
    }


}
