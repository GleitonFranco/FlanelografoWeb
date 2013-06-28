package br.edu.fanor.flanelografo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
@WebService(name="flanelografo",targetNamespace="http://localhost:8180/flanelografo")
public class Flanelografo {
		
	@WebMethod(operationName="consultaSala")
	public String consultaSala(@WebParam(name="curso") String curso) {
		return "Lab-Inf-4";
	}
}
