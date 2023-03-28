package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class Facture implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_facture", nullable = false)
    private Long idFacture ;

    @Column(length = 100)
    private String adresseFacturation;

    private Date dateFacrutation;

    public Facture() {
    }

    @ManyToMany
    Set<FactureStockable> factureStockables;

    public Facture(String adresseFacturation, Date dateFacrutation, Set<FactureStockable> factureStockables) {
        this.adresseFacturation = adresseFacturation;
        this.dateFacrutation = dateFacrutation;
        this.factureStockables = factureStockables;
    }

    public String getAdresseFacturation() {
        return adresseFacturation;
    }

    public void setAdresseFacturation(String adresseFacturation) {
        this.adresseFacturation = adresseFacturation;
    }

    public Date getDateFacrutation() {
        return dateFacrutation;
    }

    public void setDateFacrutation(Date dateFacrutation) {
        this.dateFacrutation = dateFacrutation;
    }

    public Set<FactureStockable> getFactureStockables() {
        return factureStockables;
    }

    public void setFactureStockables(Set<FactureStockable> factureStockables) {
        this.factureStockables = factureStockables;
    }
}
//Constructors

//Getters and Setters
