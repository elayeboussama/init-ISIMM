package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
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

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "enseignant_id")
    private Enseignant enseignant;

    public Emploi(Date dateDebut, Date dateFin, Set<Seance> seances) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.seances = seances;
    }

    public Emploi(Date dateDebut, Date dateFin,Enseignant enseignant ) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.seances  = new HashSet<>();
        this.enseignant = enseignant;
    }



    public Emploi() {
    }


    public void addSeance(Seance seance) {
        this.seances.add(seance);
    }

    @Override
    public String toString() {
        return "Emploi{" +
                "startDate=" + dateDebut +
                ", endDate=" + dateFin +
                ", seances=" + seances +
                ", enseignant=" + enseignant +
                '}';
    }
}
