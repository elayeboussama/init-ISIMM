package com.example.demo.entities;


import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class DemandeStockable implements Serializable {
	@Id @GeneratedValue
	private Long idDemandeStockable;
	@Column(length=100)
	private String Description;
	private enum Etat {approved,rejected,pending};
	private Etat etat;
	@OneToMany(mappedBy="demandeStockable")
	private Collection<DemandeUnStockable> DemandeUnStockables=new HashSet<DemandeUnStockable>();

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="id_employer")
	private Employer employer;



	public DemandeStockable() {
		
	}
	public DemandeStockable(String description, Etat etat) {
		Description = description;
		this.etat = etat;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	public Long getIdDemandeStockable() {
		return idDemandeStockable;
	}
	public void setIdDemandeStockable(Long idDemandeStockable) {
		this.idDemandeStockable=idDemandeStockable;
	}
	public Collection<DemandeUnStockable> getDemandeUnStockables() {
		return DemandeUnStockables;
	}
	public void setDemandeUnStockables(Collection<DemandeUnStockable> DemandeUnStockables )
	{
		this.DemandeUnStockables=DemandeUnStockables;
	}
	
	
}
