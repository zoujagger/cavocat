/**
 * 
 */
package com.zouj.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author zouj
 *
 */
@Entity
public class Rdv {
	
	@Id @GeneratedValue
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date jour;
	
	@ManyToOne
	@JoinColumn(name="id_client")
	private Clients client;
	
	@ManyToOne
	@JoinColumn(name="id_creneaux_horaire")
	private CreneauxHoraire crenauHoraire;

	/**
	 * constructeurs and getter and setters
	 */
	public Rdv() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param jour
	 * @param client
	 * @param crenauHoraire
	 */
	public Rdv(Date jour, Clients client, CreneauxHoraire crenauHoraire) {
		super();
		this.jour = jour;
		this.client = client;
		this.crenauHoraire = crenauHoraire;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the jour
	 */
	public Date getJour() {
		return jour;
	}

	/**
	 * @param jour the jour to set
	 */
	public void setJour(Date jour) {
		this.jour = jour;
	}

	/**
	 * @return the client
	 */
	public Clients getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Clients client) {
		this.client = client;
	}

	/**
	 * @return the crenauHoraire
	 */
	public CreneauxHoraire getCrenauHoraire() {
		return crenauHoraire;
	}

	/**
	 * @param crenauHoraire the crenauHoraire to set
	 */
	public void setCrenauHoraire(CreneauxHoraire crenauHoraire) {
		this.crenauHoraire = crenauHoraire;
	}

	
}
