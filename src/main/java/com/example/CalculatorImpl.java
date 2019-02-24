package com.example;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.Calculator", name = "Calculator", serviceName = "CalculatorService", portName = "CalculatorPort")
public class CalculatorImpl implements Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

}
