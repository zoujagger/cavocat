/**
 * 
 */
package com.zouj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zouj.entities.Avocats;

/**
 * @author zouj
 * interface jpa de gestion des donnee de avocat
 */
public interface AvocatsRepository extends JpaRepository<Avocats, Long> {

}
