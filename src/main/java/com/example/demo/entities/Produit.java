package com.example.demo.entities;


import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import com.example.demo.entities.*;
@Entity
public class Produit extends Stockable   {

	@OneToMany(mappedBy="produit",fetch = FetchType.LAZY)
	private Collection<Proprite> proprites=new HashSet<Proprite>();

	public Produit() {
		
	}
	public Produit(String name, Double tva, Magasin magasin, String refStockable)
	{
		super(name,tva,magasin,refStockable);
		
		
	}


	public Collection<Proprite> getProprites() {
		return proprites;
	}
	public void setProprites(Collection<Proprite> proprites )
	{
		this.proprites=proprites;
	}

	public void addProprites(Proprite proprite ){
		this.proprites.add(proprite);
	}
    
}
