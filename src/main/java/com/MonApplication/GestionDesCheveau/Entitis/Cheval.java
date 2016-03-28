package com.MonApplication.GestionDesCheveau.Entitis;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Cheval {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCheval;
    private String nomCheval;
	private String dateDeNaissance;
	private String dateCreation;
	private double poidsDateEntree;
	public Long getIdCheval() {
		return idCheval;
	}
	public void setIdCheval(Long idCheval) {
		this.idCheval = idCheval;
	}
	public String getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getPoidsDateEntree() {
		return poidsDateEntree;
	}
	public void setPoidsDateEntree(double poidsDateEntree) {
		this.poidsDateEntree = poidsDateEntree;
	}
	

	public String getNomCheval() {
		return nomCheval;
	}
	public void setNomCheval(String nomCheval) {
		this.nomCheval = nomCheval;
	}
	public Cheval() {
		// TODO Auto-generated constructor stub
	}
	public Cheval(String nomCheval, String dateDeNaissance,
			String dateCreation, double poidsDateEntree) {
		super();
		this.nomCheval = nomCheval;
		this.dateDeNaissance = dateDeNaissance;
		this.dateCreation = dateCreation;
		this.poidsDateEntree = poidsDateEntree;
	}
	
	
	
	
}
