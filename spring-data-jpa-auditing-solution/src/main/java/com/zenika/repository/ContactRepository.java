/**
 * 
 */
package com.zenika.repository;

import org.springframework.data.repository.CrudRepository;

import com.zenika.model.Contact;

/**
 * 
 * @author acogoluegnes
 *
 */
public interface ContactRepository extends CrudRepository<Contact,Long> {

}
