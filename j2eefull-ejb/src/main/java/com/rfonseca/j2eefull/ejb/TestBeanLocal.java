package com.rfonseca.j2eefull.ejb;

import java.io.Serializable;
import javax.ejb.Local;

/**
 * Local Interface
 * @author rfonseca - rfonseca85@yahoo.ca
 *
 */
@Local
public interface TestBeanLocal extends Serializable{

	public String reverseWord(final String str);	
	
}
