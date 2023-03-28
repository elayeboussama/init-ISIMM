package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class DemandeStockable implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_demande_stockable", nullable = false)
    private Long idDemandeStockable;

    @Column(length = 100)
    private String description;

    @Column(length = 100)
    private String etat;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_employer" )
    private Employer employer;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_service")
    private Service service;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_magasin")
    private Magasin magasin;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_demande_unstockable" )
    private DemandeUnstockable demandeUnstockable;

    @ManyToMany
    @JoinTable(name = "demandeStockable_stockable", joinColumns = {@JoinColumn(name = "id_demandeStockable")}, inverseJoinColumns = {@JoinColumn(name = "id_stockable")})
    Set<Stockable> stockable;

    public DemandeStockable() {

    }
    public DemandeStockable(String description, String etat, Employer employer, Service service, Magasin magasin, DemandeUnstockable demandeUnstockable, Set<Stockable> stockable) {
        this.description = description;
        this.etat = etat;
        this.employer = employer;
        this.service = service;
        this.magasin = magasin;
        this.demandeUnstockable = demandeUnstockable;
        this.stockable = stockable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public DemandeUnstockable getDemandeUnstockable() {
        return demandeUnstockable;
    }

    public void setDemandeUnstockable(DemandeUnstockable demandeUnstockable) {
        this.demandeUnstockable = demandeUnstockable;
    }

    public Set<Stockable> getStockable() {
        return stockable;
    }

    public void setStockable(Set<Stockable> stockable) {
        this.stockable = stockable;
    }
}
