package com.example.demo.entities;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


@Entity
public class FactureStockable implements Serializable {
	@Id @GeneratedValue
	private Long idFactureStockable;
	@Column(length=100)
	private Long quantite;
	private Double prix;

	@ManyToOne
	@JoinColumn(name="stockable")
	private Produit stockable;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="facture")
	private Facture facture;
	public FactureStockable() {
		
	}
	public FactureStockable(Long quantite, Double prix,Produit stockable,Facture facture) {
		this.quantite = quantite;
		this.prix = prix;

		this.stockable=stockable;
		this.facture=facture;
	}
	public Long getQuantite() {
		return quantite;
	}
	public void setQuantite(Long quantite) {
		this.quantite = quantite;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Produit getStockable() {
		return stockable;
	}
	public void setStockable(Produit stockable) {
		this.stockable=stockable;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture)
	{
		this.facture=facture;
	}
	public Long getIdFactureStockable() {
		return idFactureStockable;
	}
	public void setIdFactureStockable(Long idFactureStockable) {
		this.idFactureStockable=idFactureStockable;
	}
	
	
	
}
