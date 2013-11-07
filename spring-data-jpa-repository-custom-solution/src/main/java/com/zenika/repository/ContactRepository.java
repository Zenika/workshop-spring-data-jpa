/**
 * 
 */
package com.zenika.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.zenika.model.Contact;

/**
 * 
 * @author acogoluegnes
 *
 */
public interface ContactRepository extends ContactRepositoryCustom, Repository<Contact,Long> {

	List<Contact> findByLastname(String lastname);
	
}
