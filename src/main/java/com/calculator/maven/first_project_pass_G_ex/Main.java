package com.calculator.maven.first_project_pass_G_ex;

public class Main {

	public static void main(String[] args) {
		BasicCalculator simpleC = new BasicCalculator();
		AdvancedCalculator simpleCa = new AdvancedCalculator();
		System.out.println(simpleC.addition(1.1, 2.2));
		System.out.println(simpleCa.remainder(10.0, 3.0));
		System.out.println(simpleCa.square(10.0));
	}

}
