/**
 * 
 */
package com.zenika.repository;

import com.zenika.model.Contact;

/**
 * @author acogoluegnes
 *
 */
public interface ContactRepository {

	Contact save(Contact contact);
	
	long count();
	
}
