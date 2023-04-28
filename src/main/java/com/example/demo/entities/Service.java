package com.example.demo.entities;


import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
public class Service implements Serializable {
	@Id @GeneratedValue
	private Long idService;
	@Column(length=100)
	private String name;
	@ManyToOne
	private Magasin magasin=new Magasin();
	public Service() {
		
	}
	public Service(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Magasin getMagasin(){
		return magasin;
		
	}
	public void setMagasin(Magasin magasin)
	{
		this.magasin=magasin;
	}
	public Long getIdService() {
		return idService;
	}
	public void setIdService(Long idService) {
		this.idService=idService;
	}

	
	
}
