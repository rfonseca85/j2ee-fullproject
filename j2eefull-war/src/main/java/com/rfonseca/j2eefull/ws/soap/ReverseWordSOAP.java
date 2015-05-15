package com.rfonseca.j2eefull.ws.soap;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.rfonseca.j2eefull.ejb.TestBeanLocal;
import com.rfonseca.j2eefull.ws.types.ObjectFactory;
import com.rfonseca.j2eefull.ws.types.ReverseWordRequest;
import com.rfonseca.j2eefull.ws.types.ReverseWordResponse;


@WebService(name="ReverseWordWS",serviceName="ReverseWordSOAPService")
public class ReverseWordSOAP {

    @EJB
    private TestBeanLocal testBean;

    @WebMethod(action="reverseWord")
    public ReverseWordResponse reverseWord(@WebParam(name="request") ReverseWordRequest request){
        
        ObjectFactory factory = new ObjectFactory();
        ReverseWordResponse response = factory.createReverseWordResponse();
        
        response.setOutput(testBean.reverseWord(request.getImput()));
        
        return response;
    }    

}
