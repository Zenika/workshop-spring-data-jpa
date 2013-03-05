/**
 * 
 */
package com.zenika.nordnet.repository;

import org.springframework.data.repository.Repository;

import com.zenika.nordnet.model.Address;

/**
 * @author acogoluegnes
 *
 */
public interface AddressRepository extends AddressRepositoryCustom,Repository<Address,Long> {

}
