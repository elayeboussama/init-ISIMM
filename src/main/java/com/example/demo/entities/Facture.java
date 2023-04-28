package com.example.demo.entities;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Facture implements Serializable {
	@Id @GeneratedValue
	private Long idFacture;
	private Date dateFacturation;
	@Column(length=100)
	private String addressFacturation ;
	@ManyToOne
	@JoinColumn(name="fournisseur")
	private Fournisseur fournisseur;

	@OneToMany(mappedBy="facture")
	private Collection<FactureStockable> FactureStockables=new HashSet<FactureStockable>();
	public Facture() {
		
	}
	public Facture(Date dateFacturation, String addressFacturation,Fournisseur fournisseur) {
		this.dateFacturation = dateFacturation;
		this.addressFacturation = addressFacturation;
		this.fournisseur=fournisseur;
	
	}
	public Date getDateFacturation() {
		return dateFacturation;
	}
	public void setDateFacturation(Date dateFacturation) {
		this.dateFacturation = dateFacturation;
	}
	public String getAddressFacturation() {
		return addressFacturation;
	}
	public void setAddressFacturation(String addressFacturation) {
		this.addressFacturation = addressFacturation;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur)
	{
		this.fournisseur=fournisseur;
	}
	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture=idFacture;
	}

	public Collection<FactureStockable> getFactureStockables() {
		return FactureStockables;
	}
	public void setFactureStockables(Collection<FactureStockable> FactureStockables )
	{
		this.FactureStockables=FactureStockables;
	}

	public void addFactureStockable (FactureStockable fs){
		this.FactureStockables.add(fs);
	}


}
