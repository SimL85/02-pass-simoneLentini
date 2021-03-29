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
		assertEquals(calc.raisedToThePower(base, exponent), result, 0);
		LOG.info("Testing the method raisedToThePower with base :" + -100.0 + "and exponent " + 0.0 + "\n");
		assertEquals(calc.raisedToThePower(-100.0, 0.0), 1.0, 0);
		LOG.info("Testing the method raisedToThePower with base :" + 0.0 + "and exponent " + 0.0 + "\n");
		assertEquals(calc.raisedToThePower(0.0, 0.0), 1.0, 0);

	}

	@Test
	public void testRemainder() {
		double dividend = input.nextDouble() * 10;
		double divisor = input.nextDouble() * 10;
		double result = dividend % divisor;
		LOG.info("Testing the method remainder with dividend: " + dividend + " and divisor " + divisor + "\n");
		assertEquals(calc.remainder(dividend, divisor), result, 0);
		LOG.info("Testing the method remainder with dividend: " + -20.0 + " and divisor " + -10.0 + "\n");
		assertEquals(calc.remainder(-20.0, -10.0), 0.0, 0);
		LOG.info("Testing the method remainder with dividend: " + 0.0 + " and divisor" + 0.0 + "\n");
		assertEquals(calc.remainder(0.0, 1.0), 0.0, 0);

	}
	@Test
	public void testRoot() {
		double base = input.nextDouble() * 10;
		double exponent = input.nextDouble() * 10;
		double result = Math.pow(base,1.0/ exponent);
		LOG.info("Testing the method root with base :" + base + "and exponent " + exponent + "\n");
		assertEquals(calc.root(base, exponent), result, 0);
		
	

	}
	@Test
	public void testAbsoluteValue() {
		double number = input.nextDouble() * -10;
		double result = Math.abs(number);
		LOG.info("Testing the method absoluteValue:" + number +"\n");
		assertEquals(calc.absoluteValue(number), result, 0);
	}
}
