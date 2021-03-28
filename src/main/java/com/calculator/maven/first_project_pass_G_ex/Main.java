package com.calculator.maven.first_project_pass_G_ex;

public class Main {

	public static void main(String[] args) {
		BasicCalculator simpleC = new BasicCalculator();
		AdvancedCalculator advCa = new AdvancedCalculator();
		System.out.println(simpleC.addition(1.1, 2.2));
		System.out.println(simpleC.subtraction(1.1, 2.2));
		System.out.println(simpleC.division(1.1, 2.2));
		System.out.println(simpleC.division(2.2, 0));
		System.out.println(simpleC.moltiplication(1.1, 2.2));
		System.out.println(advCa.remainder(10.0, 3.0));
		System.out.println(advCa.square(10.0));
		System.out.println(advCa.root(16.0, 2));
		System.out.println(advCa.absoluteValue(-2.2));
		System.out.println(advCa.raisedToThePower(0, 0));
	}

}
