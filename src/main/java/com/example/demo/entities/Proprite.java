package com.example.demo.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Proprite implements Serializable {
	
	
	@Id @GeneratedValue
	private Long idProprite;
	@Column(length=100)
	private String cle;
	@Column(length=100)
	private String valeur;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="produit")
	private Produit produit;
	public Proprite() {
		
	}
	public Proprite(String cle ,String Valeur,Produit produit)
	{
		this.cle=cle;
		this.valeur=Valeur;
		this.produit=produit;
	}
	public String getCle() {
		return cle;
	}
	public void setCle(String cle) {
		this.cle = cle;
	}
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit=produit;
	}
	public Long getIdProprite() {
		return idProprite;
	}
	public void setIdProprite(Long idProprite) {
		this.idProprite=idProprite;
	}
}
