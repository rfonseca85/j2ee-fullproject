package com.rfonseca.j2eefull.ws.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.rfonseca.j2eefull.ejb.TestBeanLocal;

@Path("/reverseword")
public class ReverseWordRest {
 
    @EJB
    private TestBeanLocal testBean;

    @GET
    @Path("{request}/resultword/")
    @Produces("text/plain")
    public String reverseWord(@PathParam("request") String word){ 

        return testBean.reverseWord(word);
  
    }
}