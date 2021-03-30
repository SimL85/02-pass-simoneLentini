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
	public void testAddPn() {
		double firstNumber = input.nextDouble();
		double secondNumber = input.nextDouble();
		double result = firstNumber + secondNumber;

		LOG.info("Testing the method addition with positive numbers: " + firstNumber + " + " + secondNumber + "\n");
		assertEquals(simpleC.addition(firstNumber, secondNumber), result, 0);

	}

	@Test
	public void testAddNn() {
		double firstNumber = input.nextDouble() * -1;
		double secondNumber = input.nextDouble() * -1;
		double result = firstNumber + secondNumber;

		LOG.info("Testing the method addition with negative numbers: " + firstNumber + " + " + secondNumber + "\n");
		assertEquals(simpleC.addition(firstNumber, secondNumber), result, 0);

	}
	@Test
	public void testAddZero() {
		double firstNumber = input.nextDouble();
		double secondNumber = 0;
		double result = firstNumber + secondNumber;

		LOG.info("Testing the method addition with: " + firstNumber + " + " + secondNumber + "\n");
		assertEquals(simpleC.addition(firstNumber, secondNumber), result, 0);
	}

	@Test
	public void testSubPn() {
		double firstNumber = input.nextDouble();
		double secondNumber = input.nextDouble();
		double result = firstNumber - secondNumber;

		LOG.info("Testing the method subtraction with positive numbers: " + firstNumber + " - " + secondNumber + "\n");
		assertEquals(simpleC.subtraction(firstNumber, secondNumber), result, 0);

	}

	@Test
	public void testSubNn() {
		double firstNumber = input.nextDouble() * -1;
		double secondNumber = input.nextDouble() * -1;
		double result = firstNumber - secondNumber;

		LOG.info("Testing the method subtractionwith negative numbers: " + firstNumber + " - " + secondNumber + "\n");
		assertEquals(simpleC.subtraction(firstNumber, secondNumber), result, 0);

	}

	@Test
	public void testSubZero() {
		double firstNumber = input.nextDouble();
		double secondNumber = 0;
		double result = firstNumber - secondNumber;

		LOG.info("Testing the method subtraction with: " + firstNumber + " - " + secondNumber + "\n");
		assertEquals(simpleC.subtraction(firstNumber, secondNumber), result, 0);

	}

	@Test
	public void testDivPn() {
		double firstNumber = input.nextDouble();
		double secondNumber = input.nextDouble();
		double result = firstNumber / secondNumber;

		LOG.info("Testing the method division with positve numbers: " + firstNumber + " / " + secondNumber + "\n");
		assertEquals(simpleC.division(firstNumber, secondNumber), result, 0);

	}

	@Test
	public void testDivNn() {
		double firstNumber = input.nextDouble() * -1;
		double secondNumber = input.nextDouble() * -1;
		double result = firstNumber / secondNumber;

		LOG.info("Testing the method division with negative numbers: " + firstNumber + " / " + secondNumber + "\n");
		assertEquals(simpleC.division(firstNumber, secondNumber), result, 0);

	}

	@Test
	public void testDivZero() {
		double firstNumber = input.nextDouble();
		double secondNumber = 0;
		double result = -0.123456789;

		LOG.info("Testing the method division with: " + firstNumber + " / " + secondNumber + "\n");
		assertEquals(simpleC.division(firstNumber, secondNumber), result, 0);

	}

	@Test
	public void testMoltPn() {
		double firstNumber = input.nextDouble();
		double secondNumber = input.nextDouble();
		double result = firstNumber * secondNumber;

		LOG.info("Testing the method moltiplication with positive numbers: " + firstNumber + " * " + secondNumber
				+ "\n");
		assertEquals(simpleC.moltiplication(firstNumber, secondNumber), result, 0);
		
	}

	@Test
	public void testMoltNn() {
		double firstNumber = input.nextDouble() * -1;
		double secondNumber = input.nextDouble() * -1;
		double result = firstNumber * secondNumber;

		LOG.info("Testing the method moltiplication with negative numbers: " + firstNumber + " * " + secondNumber
				+ "\n");
		assertEquals(simpleC.moltiplication(firstNumber, secondNumber), result, 0);
		LOG.info("Testing the method moltiplication with: " + -10 + " * " + -20 + "\n");
		assertEquals(simpleC.moltiplication(-10.0, -20.0), 200.0, 0);
		LOG.info("Testing the method moltiplication with: " + 14.3 + " * " + 0.0 + "\n");
		assertEquals(simpleC.moltiplication(14.3, 0.0), 0.0, 0);

	}
	@Test
	public void testMoltZero() {
		double firstNumber = input.nextDouble();
		double secondNumber = 0;
		double result = firstNumber * secondNumber;

		LOG.info("Testing the method moltiplication with: " + firstNumber + " * " + secondNumber
				+ "\n");
		assertEquals(simpleC.moltiplication(firstNumber, secondNumber), result, 0);
		

	}

}