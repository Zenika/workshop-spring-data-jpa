/**
 * 
 */
package com.zenika.repository;

import org.springframework.data.repository.Repository;

import com.zenika.model.Contact;

/**
 * 
 * @author acogoluegnes
 *
 */
public interface ContactRepository extends ContactRepositoryCustom,Repository<Contact,Long> {

	// TODO 06 rendre l'interface ContactRepository capable d'exécuter des Predicates
	
}
