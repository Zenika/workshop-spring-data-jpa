/**
 * 
 */
package com.zenika.repository;


import com.mysema.query.types.expr.BooleanExpression;
import com.zenika.model.QContact;

/**
 * @author acogoluegnes
 *
 */
public abstract class ContactSpecs {

	public static BooleanExpression outlaws() {
		return QContact.contact.lastname.eq("Dalton");
	}
	
	public static BooleanExpression inMidThirties() {
		return QContact.contact.age.between(30, 40);
	}
	
}
