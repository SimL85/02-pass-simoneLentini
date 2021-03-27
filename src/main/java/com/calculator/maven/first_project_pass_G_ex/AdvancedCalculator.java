package com.calculator.maven.first_project_pass_G_ex;

public class AdvancedCalculator extends BasicCalculator implements AndvanceOperations {
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

	public double root(double base, double exponent) {

		return Math.round(Math.pow(base, 1.0 / exponent));
	}

	public double absoluteValue(double number) {
		return Math.abs(number);
	}
}
