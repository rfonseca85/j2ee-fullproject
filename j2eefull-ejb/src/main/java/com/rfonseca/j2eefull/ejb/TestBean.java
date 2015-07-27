package com.rfonseca.j2eefull.ejb;

import java.util.logging.Logger;

import javax.ejb.Stateless;

/**
 * Implementation
 * @author rfonseca - rfonseca85@yahoo.ca
 *
 */
@Stateless(name = "TestBean", mappedName = "com.rfonseca.ejb.TestBean")
public class TestBean implements TestBeanLocal {

	Logger logger = Logger.getLogger(this.getClass().getName());

	@Override
	public String reverseWord(final String str) {		
		logger.info("request operation: " + str);
		
		String resultString = null;
		if (str != null && !str.isEmpty()) {
			StringBuilder stringReverse = new StringBuilder();
			for (int i = str.length() - 1; i >= 0; i--) {
				stringReverse.append(str.charAt(i));
			}
			resultString = stringReverse.toString();
		}
		
		logger.info("operation output: " + resultString);
		return resultString;
	}

}
//Good test