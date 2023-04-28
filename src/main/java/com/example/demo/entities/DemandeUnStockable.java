package com.example.demo.entities;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class DemandeUnStockable implements Serializable {
	@Id @GeneratedValue
	private Long idDemandeUnStockable;
	private Long quantite;
	@ManyToOne
	@JoinColumn(name="stockable")
	private Produit stockable;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="demandeStockable")
	private DemandeStockable demandeStockable;

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="id_employer")
	private Employer employer;
	public DemandeUnStockable() {
		
	}
	public DemandeUnStockable(Long quantite) {
		this.quantite = quantite;
	}
	public Long getQuantite() {
		return quantite;
	}
	public void setQuantite(Long quantite) {
		this.quantite = quantite;
	}
	public Long getIdDemandeUnStockable() {
		return idDemandeUnStockable;
	}
	public void setIdDemandeUnStockable(Long idDemandeUnStockable) {
		this.idDemandeUnStockable=idDemandeUnStockable;
	}
	public Produit getStockable() {
		return stockable;
	}
	public void setStockable(Produit stockable) {
		this.stockable=stockable;
	}
	public DemandeStockable getDemandeStockable() {
		return demandeStockable;
	}
	public void setDemandeStockable(DemandeStockable demandeStockable )
	{
		this.demandeStockable=demandeStockable;
	}
	
	
	
}
