/**
 * 
 */
package com.zenika.business;

import com.zenika.model.User;

/**
 * @author acogoluegnes
 *
 */
public interface AuthenticationService {

	User authenticate(String login,String password);
	
}
