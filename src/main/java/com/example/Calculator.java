package com.example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface Calculator {
	@WebMethod
	int add(int a, int b);

	@WebMethod
	int subtract(int a, int b);

	@WebMethod
	int multiply(int a, int b);

	@WebMethod
	int divide(int a, int b);
}
