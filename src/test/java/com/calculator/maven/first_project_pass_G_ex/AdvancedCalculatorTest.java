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
	public void testSquarePn() {
		double number = input.nextDouble();
		double result = number * number;
		LOG.info("Testing the method square with a positive number: " + number + "\n");
		assertEquals(calc.square(number), result, 0);

	}

	@Test
	public void testSquareNn() {
		double number = input.nextDouble() * -1;
		double result = number * number;
		LOG.info("Testing the method square with a negative number: " + number + "\n");
		assertEquals(calc.square(number), result, 0);

	}

	@Test
	public void testSquareZero() {
		double number = 0;
		double result = number * number;
		LOG.info("Testing the method square of: " + number + "\n");
		assertEquals(calc.square(number), result, 0);

	}

	@Test
	public void testRaisedToThePowerPn() {
		double base = input.nextDouble();
		double exponent = input.nextDouble();
		double result = Math.pow(base, exponent);
		LOG.info("Testing the method raisedToThePower with base :" + base + "and exponent " + exponent + "\n");
		assertEquals(calc.raisedToThePower(base, exponent), result, 0);

	}

	@Test
	public void testRaisedToThePowerNn() {
		double base = input.nextDouble() * -1;
		double exponent = input.nextDouble() * -1;
		double result = Math.pow(base, exponent);
		LOG.info("Testing the method raisedToThePower with base(negative number) :" + base + "and exponent(negative number) "
				+ exponent + "\n");
		assertEquals(calc.raisedToThePower(base, exponent), result, 0);

	}

	@Test
	public void testRaisedToThePowerZero() {
		double base = 0;
		double exponent = 0;
		double result = Math.pow(base, exponent);
		LOG.info("Testing the method raisedToThePower with base :" + base + "and exponent " + exponent + "\n");
		assertEquals(calc.raisedToThePower(base, exponent), result, 0);

	}

	@Test
	public void testRemainderPn() {
		double dividend = input.nextDouble();
		double divisor = input.nextDouble();
		double result = dividend % divisor;
		LOG.info("Testing the method remainder with dividend: " + dividend + " and divisor " + divisor + "\n");
		assertEquals(calc.remainder(dividend, divisor), result, 0);
		

	}
	@Test
	public void testRemainderNn() {
		double dividend = input.nextDouble()*-1;
		double divisor = input.nextDouble()*-1;
		double result = dividend % divisor;
		LOG.info("Testing the method remainder with dividend(negative number): " + dividend + " and divisor(negative number) " + divisor + "\n");
		assertEquals(calc.remainder(dividend, divisor), result, 0);
		

	}
	@Test
	public void testRemainderZero() {
		double dividend = 0;
		double divisor = 0;
		double result = dividend % divisor;
		LOG.info("Testing the method remainder with dividend: " + dividend + " and divisor " + divisor + "\n");
		assertEquals(calc.remainder(dividend, divisor), result, 0);
		

	}
	@Test
	public void testRootPn() {
		double base = input.nextDouble();
		double exponent = input.nextDouble();
		double result = Math.pow(base, 1.0 / exponent);
		LOG.info("Testing the method root with base :" + base + "and exponent " + exponent + "\n");
		assertEquals(calc.root(base, exponent), result, 0);

	}
	@Test
	public void testRootNn() {
		double base = input.nextDouble() * -1;
		double exponent = input.nextDouble() * -1;
		double result = Math.pow(base, 1.0 / exponent);
		LOG.info("Testing the method root with base(negative number):" + base + "and exponent(negative number) " + exponent + "\n");
		assertEquals(calc.root(base, exponent), result, 0);

	}
	@Test
	public void testRootZero() {
		double base = 0;
		double exponent = 0;
		double result = Math.pow(base, 1.0 / exponent);
		LOG.info("Testing the method root with base :" + base + "and exponent " + exponent + "\n");
		assertEquals(calc.root(base, exponent), result, 0);

	}
	@Test
	public void testAbsoluteValueNn() {
		double number = input.nextDouble() * -1;
		double result = Math.abs(number);
		LOG.info("Testing the method absoluteValue(negative number):" + number + "\n");
		assertEquals(calc.absoluteValue(number), result, 0);
	}
	@Test
	public void testAbsoluteValuePn() {
		double number = input.nextDouble();
		double result = Math.abs(number);
		LOG.info("Testing the method absoluteValue:" + number + "\n");
		assertEquals(calc.absoluteValue(number), result, 0);
	}
	@Test
	public void testAbsoluteValueZero() {
		double number = 0;
		double result = Math.abs(number);
		LOG.info("Testing the method absoluteValue:" + number + "\n");
		assertEquals(calc.absoluteValue(number), result, 0);
	}
}
