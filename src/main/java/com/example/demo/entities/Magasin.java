package com.example.demo.entities;


import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
@Entity
public class Magasin implements Serializable {
	@Id @GeneratedValue
	private Long idMagasin;
	@Column(length=100)
	private String name;
	@OneToMany(mappedBy="magasin")
	private Collection<Service> services=new HashSet<Service>();
	@OneToMany(mappedBy="magasin")
	private Collection<Stockable> Stockables=new HashSet<Stockable>();
	public Magasin() {
		
	}
	public Magasin(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getIdMagasin() {
		return idMagasin;
	}
	public void setIdMagasin(Long idMagasin) {
		this.idMagasin=idMagasin;
	}

	@JsonIgnore
	public Collection<Service> getServices() {
		return services;
	}
	public void setServices(Collection<Service> Services )
	{
		this.services=Services;
	}

	@JsonIgnore
	public Collection<Stockable> getStockables() {
		return Stockables;
	}
	public void setStockables(Collection<Stockable> Stockables )
	{
		this.Stockables=Stockables;
	}


	public void addService(Service service) {
		this.services.add(service);
	}
	public void addStockables(Stockable stockable) {
		this.Stockables.add(stockable);
	}
}
