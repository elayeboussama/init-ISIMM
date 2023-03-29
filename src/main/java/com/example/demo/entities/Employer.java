package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Employer")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public class Employer  extends Personne {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id_employer", nullable = false)
//    private Long idEmployer;


    @Column
    private Date DateEmbauche;
    @Column
    private int NbJourCongeTotale;
    @Column
    private int NbJourCongeRestant;
    @Column
    private float Salaire;

    @ManyToMany
    private Set<Service> services;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="department")
    private Department department;

    @OneToMany(mappedBy = "employer",fetch=FetchType.LAZY)
    private Set<DemandeConger> demandeConger;

    @OneToMany(mappedBy = "employer",fetch=FetchType.LAZY)
    private Set<DemandeStockable> demandeStockable;



    public Employer(Department department, Set<DemandeConger> demandeConger, Set<DemandeStockable> demandeStockable, String cin, String nom, String prenom, Date naissance, Sexe sexe, String adresse, String password, String email, String telephone, int age, Date DateEmbauche, int NbJourCongeTotale, int NbJourCongeRestant, float Salaire) {
        super(cin, nom, prenom, naissance, sexe, adresse, password, email, telephone, age);
        this.department = department;
        this.demandeConger = demandeConger;
        this.demandeStockable = demandeStockable;
        this.Salaire = Salaire;
        this.DateEmbauche = DateEmbauche;
        this.NbJourCongeTotale = NbJourCongeTotale;
        this.NbJourCongeRestant = NbJourCongeRestant;
    }

    public Employer() {
    }




}
