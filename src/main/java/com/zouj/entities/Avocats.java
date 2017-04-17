/**
 * 
 */
package com.zouj.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


/**
 * @author zouj
 *
 */
@Entity
@DiscriminatorValue("AVO")
public class Avocats extends Personne{
	
	/**
	 * donneees membres
	 */
	private static final long serialVersionUID = 1L;
	
	private String specialite;
	private double honoraire;
	
	@OneToMany(mappedBy="avocat")
	private List<CreneauxHoraire> creneaux;
	/**
	 * 
	 */
	public Avocats() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param email
	 */
	public Avocats(String nom, String prenom, String adresse, String email) {
		super(nom, prenom, adresse, email);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param email
	 * @param specialite
	 * @param honoraire
	 */
	public Avocats(String nom, String prenom, String adresse, String email, String specialite, double honoraire) {
		super(nom, prenom, adresse, email);
		this.specialite = specialite;
		this.honoraire = honoraire;
	}
	/**
	 * @return the specialite
	 */
	public String getSpecialite() {
		return specialite;
	}
	/**
	 * @param specialite the specialite to set
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	/**
	 * @return the honoraire
	 */
	public double getHonoraire() {
		return honoraire;
	}
	/**
	 * @param honoraire the honoraire to set
	 */
	public void setHonoraire(double honoraire) {
		this.honoraire = honoraire;
	}
	/**
	 * @return the creneaux
	 */
	public List<CreneauxHoraire> getCreneaux() {
		return creneaux;
	}
	/**
	 * @param creneaux the creneaux to set
	 */
	public void setCreneaux(List<CreneauxHoraire> creneaux) {
		this.creneaux = creneaux;
	}
	
	/**
	 * constructeurs and getter and setters
	 */
	
	
	
}
