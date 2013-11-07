/**
 * 
 */
package com.zenika.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.zenika.model.User;

/**
 * 
 * @author acogoluegnes
 *
 */
public interface UserRepository extends CrudRepository<User,Long>,JpaSpecificationExecutor<User> {


	
}
