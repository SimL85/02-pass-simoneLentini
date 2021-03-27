package com.calculator.maven.first_project_pass_G_ex;

public class BasicCalculator implements BasicOperations {
	public double addition(double firstNumber, double secondNumber) {
		double result = firstNumber + secondNumber;
		return result;
	}

	public double subtraction(double firstNumber, double secondNumber) {
		double result = firstNumber - secondNumber;
		return result;
	}

	public double division(double firstNumber, double secondNumber) {
		if (secondNumber == 0) {
			System.out.println("You can not divide by zero");
			return -0.123456789;
		} else {
			double result = firstNumber / secondNumber;
			return result;
		}
	}

	public double moltiplication(double firstNumber, double secondNumber) {
		double result = firstNumber + secondNumber;
		return result;
	}

}
