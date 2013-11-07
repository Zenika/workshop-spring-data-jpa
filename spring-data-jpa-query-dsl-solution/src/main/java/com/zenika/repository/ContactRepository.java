/**
 * 
 */
package com.zenika.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.Repository;

import com.zenika.model.Contact;

/**
 * 
 * @author acogoluegnes
 *
 */
public interface ContactRepository extends ContactRepositoryCustom,Repository<Contact,Long>,QueryDslPredicateExecutor<Contact> {

}
