/**
 * 
 */
package com.zenika.repository;

import org.springframework.data.repository.Repository;

import com.zenika.model.Contact;

/**
 * @author acogoluegnes
 *
 */
// TODO 08 hériter de l'interface custom
public interface AddressRepository extends Repository<Contact,Long> {

}
