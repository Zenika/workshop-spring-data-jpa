/**
 * 
 */
package com.zenika.repository;

import java.util.List;

import com.zenika.model.Address;

/**
 * @author acogoluegnes
 *
 */
public interface AddressRepositoryCustom {

	List<Address> findByExample(Address address);
	
}
