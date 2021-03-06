/**
 * 
 */
package com.zenika.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.zenika.model.Address;

/**
 * @author acogoluegnes
 *
 */
public class AddressRepositoryImpl implements AddressRepositoryCustom {
	
	@PersistenceContext private EntityManager em;

	/* (non-Javadoc)
	 * @see com.zenika.repository.AddressRepositoryCustom#findByExample(com.zenika.model.Address)
	 */
	@Override
	public List<Address> findByExample(Address address) {
		TypedQuery<Address> query = em.createQuery("from Address a where a.zipCode = ? and a.city = ?", Address.class);
		query.setParameter(1, address.getZipCode());
		query.setParameter(2, address.getCity());
		return query.getResultList();
	}

}
