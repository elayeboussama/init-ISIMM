package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Emploi")
@Getter
@Setter

public class Emploi implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id_emploi", nullable = false)
        private Long idEmploi;


    @Column
    private Date dateDebut;

    @Column
    private Date dateFin;

    @OneToMany(mappedBy = "emploi",fetch=FetchType.LAZY)
    @JsonManagedReference
    private Set<Seance> seances;

    public Emploi(Date dateDebut, Date dateFin, Set<Seance> seances) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.seances = seances;
    }

    public Emploi(Date dateDebut, Date dateFin ) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.seances  = new HashSet<>();
    }



    public Emploi() {
    }


    public void addSeance(Seance seance) {
        this.seances.add(seance);
    }


}
