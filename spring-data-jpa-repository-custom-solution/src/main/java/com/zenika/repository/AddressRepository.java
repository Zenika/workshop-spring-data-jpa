/**
 * 
 */
package com.zenika.repository;

import org.springframework.data.repository.Repository;

import com.zenika.model.Address;

/**
 * @author acogoluegnes
 *
 */
public interface AddressRepository extends AddressRepositoryCustom,Repository<Address,Long> {

}
