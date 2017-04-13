/**
 * 
 */
package com.zouj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zouj.entities.Clients;

/**
 * @author zouj
 * interface jpa pour entite client 
 * on ajoutera les methodes specifi<ues d'acces aux data ici
 */
public interface ClientsRepository extends JpaRepository<Clients, Long>{
	
}
