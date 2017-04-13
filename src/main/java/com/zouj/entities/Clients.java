/**
 * 
 */
package com.zouj.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author zouj
 *
 */
@Entity
@DiscriminatorValue("CLI")
public class Clients extends Personne{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double revenu;
	private String profession;
	/**
	 * 
	 */
	public Clients() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param email
	 */
	public Clients(String nom, String prenom, String adresse, String email) {
		super(nom, prenom, adresse, email);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param email
	 * @param revenu
	 * @param profession
	 */
	public Clients(String nom, String prenom, String adresse, String email, double revenu, String profession) {
		super(nom, prenom, adresse, email);
		this.revenu = revenu;
		this.profession = profession;
	}
	/**
	 * @param revenu
	 * @param profession
	 */
	public Clients(double revenu, String profession) {
		super();
		this.revenu = revenu;
		this.profession = profession;
	}
	/**
	 * @return the revenu
	 */
	public double getRevenu() {
		return revenu;
	}
	/**
	 * @param revenu the revenu to set
	 */
	public void setRevenu(double revenu) {
		this.revenu = revenu;
	}
	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}
	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * constructeurs and getter and setters
	 */
	

}
