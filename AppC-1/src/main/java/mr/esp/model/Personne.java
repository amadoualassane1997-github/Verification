package mr.esp.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Personne implements Serializable{
	private String nom;
	private String prenom;
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

}
