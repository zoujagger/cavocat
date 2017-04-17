/**
 * 
 */
package com.zouj.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author zouj
 *
 */
@Entity
public class CreneauxHoraire {
	@Id @GeneratedValue
	private Long id;
	private int HDebut;
	private int HFin;
	private int MDebut;
	private int MFin;
	
	@ManyToOne
	@JoinColumn(name="id_avocat")
	private Avocats avocat;
	
	@OneToMany(mappedBy="id")
	private List<Rdv> rdv;
	

	/**	
	 * constructeurs and getter and setters
	 */
	public CreneauxHoraire() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param hDebut
	 * @param hFin
	 * @param mDebut
	 * @param mFin
	 * @param avocat
	 */
	public CreneauxHoraire(int hDebut, int hFin, int mDebut, int mFin, Avocats avocat) {
		super();
		HDebut = hDebut;
		HFin = hFin;
		MDebut = mDebut;
		MFin = mFin;
		this.avocat = avocat;
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
	 * @return the hDebut
	 */
	public int getHDebut() {
		return HDebut;
	}


	/**
	 * @param hDebut the hDebut to set
	 */
	public void setHDebut(int hDebut) {
		HDebut = hDebut;
	}


	/**
	 * @return the hFin
	 */
	public int getHFin() {
		return HFin;
	}


	/**
	 * @param hFin the hFin to set
	 */
	public void setHFin(int hFin) {
		HFin = hFin;
	}


	/**
	 * @return the mDebut
	 */
	public int getMDebut() {
		return MDebut;
	}


	/**
	 * @param mDebut the mDebut to set
	 */
	public void setMDebut(int mDebut) {
		MDebut = mDebut;
	}


	/**
	 * @return the mFin
	 */
	public int getMFin() {
		return MFin;
	}


	/**
	 * @param mFin the mFin to set
	 */
	public void setMFin(int mFin) {
		MFin = mFin;
	}


	/**
	 * @return the avocat
	 */
	public Avocats getAvocat() {
		return avocat;
	}


	/**
	 * @param avocat the avocat to set
	 */
	public void setAvocat(Avocats avocat) {
		this.avocat = avocat;
	}


	/**
	 * @return the rdv
	 */
	public List<Rdv> getRdv() {
		return rdv;
	}


	/**
	 * @param rdv the rdv to set
	 */
	public void setRdv(List<Rdv> rdv) {
		this.rdv = rdv;
	}

	
}
