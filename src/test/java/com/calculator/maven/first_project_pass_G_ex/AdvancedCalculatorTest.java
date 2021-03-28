package com.calculator.maven.first_project_pass_G_ex;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class AdvancedCalculatorTest {
	AdvancedCalculator calc = new AdvancedCalculator();
	Random input = new Random();
	public static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());

	@Test
	public void testSquare() {
		double number = input.nextDouble() * 10;
		double result = number * number;
		LOG.info("Testing the method square of: " + number + "\n");
		assertEquals(calc.square(number), result, 0);
		LOG.info("Testing the method square of: " + -2.0 + "\n");
		assertEquals(calc.square(-2.0), 4.0, 0);
		LOG.info("Testing the method square of: " + 0.0 + "\n");
		assertEquals(calc.square(0.0), 0.0, 0);

	}

	@Test
	public void testRaisedToThePower() {
		double base = input.nextDouble() * 10;
		double exponent = input.nextDouble() * 10;
		double result = Math.pow(base, exponent);
		LOG.info("Testing the method raisedToThePower with base :" + base + "and exponent " + exponent + "\n");
		assertEquals(calc.raisedToThePower(base,exponent), result, 0);
		LOG.info("Testing the method raisedToThePower with base :" + -100 + "and exponent " + 0 + "\n");
		assertEquals(calc.raisedToThePower(-100,0), 1, 0);
		LOG.info("Testing the method raisedToThePower with base :" + 0 + "and exponent " + 0 + "\n");
		assertEquals(calc.raisedToThePower(0,0), 1, 0);

	}

}
