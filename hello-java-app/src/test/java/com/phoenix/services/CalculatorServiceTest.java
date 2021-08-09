package com.phoenix.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.phoenix.math.Calculator;
/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @copyright Sterlite Technologies Ltd.
 * @creation date 22-jul-2021
 */
public class CalculatorServiceTest {
	private CalculatorService calci;
	
	@Before
	public void init() {
		calci = new CalculatorService(new Calculator());
	}
	
	@Test
	public void testAddition() {
		assertEquals(50, calci.addition(30, 20));
	}
	
	@After
	public void clean() {
		calci = null;
	}
	
}
