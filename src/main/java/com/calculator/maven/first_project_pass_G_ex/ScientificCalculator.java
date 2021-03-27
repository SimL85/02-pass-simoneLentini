package com.calculator.maven.first_project_pass_G_ex;

public class ScientificCalculator extends SimpleCalculator implements AndvanceMathOperations {
	public double square(double number) {
		double result = number * number;
		return result;

	}

	public double raisedToThePower(double base, double exponent) {
		double result = Math.pow(base, exponent);
		return result;
	}

	public double remainder(double dividend, double divisor) {
		double result = dividend % divisor;
		return result;
	}
}
