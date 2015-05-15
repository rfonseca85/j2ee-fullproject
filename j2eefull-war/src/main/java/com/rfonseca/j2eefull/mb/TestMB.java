package com.rfonseca.j2eefull.mb;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.rfonseca.j2eefull.ejb.TestBeanLocal;

/**
 * Managed bean Test
 * @author rfonseca - rfonseca85@yahoo.ca
 *
 */
@ManagedBean
@ViewScoped
public class TestMB implements Serializable{

	private static final long serialVersionUID = 7999393918462415642L;

	//Dependency Infection EJB
	@EJB
	private TestBeanLocal testBean;
	
	//Binding JSF
	private String imput;
	private String output;
	
	//reverseWord
	public void reverseWord(){
		output = testBean.reverseWord(imput);
	}

	public String getImput() {
		return imput;
	}

	public void setImput(String imput) {
		this.imput = imput;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
}
