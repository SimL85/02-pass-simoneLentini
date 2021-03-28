package com.calculator.maven.first_project_pass_G_ex;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator simpleC = new BasicCalculator();
	Random input = new Random();
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());

	@Test
	public void testAdd() {
		double firstNumber = input.nextDouble() * 10;
		double secondNumber = input.nextDouble() * 10;
		double result = firstNumber + secondNumber;

		LOG.info("Testing the method addition with: " + firstNumber + " + " + secondNumber + "\n");
		assertEquals(simpleC.addition(firstNumber, secondNumber), result, 0);
		LOG.info("Testing the method addition with: " + -2.2 + " + " + -3.2 + "\n");
		assertEquals(simpleC.addition(-2.2, -3.2), -5.4, 0);
		LOG.info("Testing the method addition with: " + 11.12+ " + " + 0 + "\n");
		assertEquals(simpleC.addition(11.12, 0), 11.12, 0);

	}

	@Test
	public void testSub() {
		double firstNumber = input.nextDouble() * 10;
		double secondNumber = input.nextDouble() * 10;
		double result = firstNumber - secondNumber;

		LOG.info("Testing the method subtraction with: " + firstNumber + " - " + secondNumber + "\n");
		assertEquals(simpleC.subtraction(firstNumber, secondNumber), result, 0);
		LOG.info("Testing the method subtraction with: " + -12.54 + " - " + -2.54 + "\n");
		assertEquals(simpleC.subtraction(-12.54, -2.54), -10.0, 0);
		LOG.info("Testing the method subtraction with: " + 150.2 + " - " + 0 + "\n");
		assertEquals(simpleC.subtraction(150.2, 0), 150.2, 0);

	}

	@Test
	public void testDiv() {
		double firstNumber = input.nextDouble() * 10;
		double secondNumber = input.nextDouble() * 10;
		double result = firstNumber / secondNumber;

		LOG.info("Testing the method division with: " + firstNumber + " / " + secondNumber + "\n");
		assertEquals(simpleC.division(firstNumber, secondNumber), result, 0);
		LOG.info("Testing the method division with: " + -1.0 + " / " + -2.0 + "\n");
		assertEquals(simpleC.division(-1.0, -2.0), 0.5, 0);
		LOG.info("Testing the method division with: " + 1.0 + " / " + 0.0 + "\n");
		assertEquals(simpleC.division(1.0, 0.0), -0.123456789, 0);

	}

	@Test
	public void testMolt() {
		double firstNumber = input.nextDouble() * 10;
		double secondNumber = input.nextDouble() * 10;
		double result = firstNumber * secondNumber;

		LOG.info("Testing the method moltiplication with: " + firstNumber + " * " + secondNumber + "\n");
		assertEquals(simpleC.moltiplication(firstNumber, secondNumber), result, 0);
		LOG.info("Testing the method moltiplication with: " + -10 + " * " + -20 + "\n");
		assertEquals(simpleC.moltiplication(-10.0, -20.0), 200.0, 0);
		LOG.info("Testing the method moltiplication with: " + 14.3 + " * " + 0.0 + "\n");
		assertEquals(simpleC.moltiplication(14.3, 0.0), 0.0, 0);

	}

}
