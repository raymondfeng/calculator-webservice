package com.example;

import javax.xml.ws.Endpoint;

public class CalculatorServer {

	public static void main(String[] args) {
		Endpoint ep = Endpoint.create(new CalculatorImpl());
		ep.publish("http://0.0.0.0:8080/calculator");
	}

}
