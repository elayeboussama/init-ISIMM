package com.example.demo.entities;


import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Fournisseur implements  Serializable {
	
	@Id @GeneratedValue
	private Long idFournisseur;
	
	private String name;
	private String adresse;
	private Long phoneNum;
	
	private String adresseMail;

	@OneToMany(mappedBy="fournisseur")
	private Collection<Facture> Factures=new HashSet<Facture>();
	public Fournisseur() {
		
	}






	public Fournisseur(String name,String adresse,Long phoneNum,String adresseMail) {
		this.name = name;
		this.adresse=adresse;
		this.phoneNum=phoneNum;
		this.adresseMail=adresseMail;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur=idFournisseur;
	}
	public String getAdresse()
	{
		return adresse;
	}
	public void setAdresse(String adresse)
	{
		this.adresse=adresse;
	}
	public Long getPhoneNum()
	{
		return phoneNum;
	}
	public void setPhoneNum(Long phoneNum)
	{
		this.phoneNum=phoneNum;
	}
	public String getAdresseMail()
	{
		return adresseMail;
	}
	public void setAdresseMail(String adresseMail)
	{
		this.adresseMail=adresseMail;
	}
	public void setFactures(Collection<Facture> Factures )
	{
		this.Factures=Factures;
	}

	@JsonIgnore
	public Collection<Facture> getFactures() {
		return Factures;
	}


	public void addFacture(Facture f){
		this.Factures.add(f);
	}
	

}
