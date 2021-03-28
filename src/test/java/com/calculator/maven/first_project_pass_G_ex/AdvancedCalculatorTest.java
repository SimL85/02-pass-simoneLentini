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
	}

}
