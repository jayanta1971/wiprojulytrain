package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.calc.Calculator;

class CalcTest {

	static Calculator calc = null;
	//Fixtures -> @BeforeAll,@AfterAll,@BeforeEach,@AfterEach
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
 
		calc = new Calculator();
	}

	@AfterAll
	static void destroy() {
		calc = null;
	}

	@BeforeEach
	void setUp() {

	}

	@AfterEach
	void tearDown() {

	}

	@Test
	void addPositive() {
 
		int sum = calc.add(2, 3);
		assertTrue(sum == 5);
	}

	@Test
	void addNegative() {

		int sum = calc.add(2, 3);
		assertFalse(sum == 6);
	}

	@Test
	void subPositive() {

		int sub = calc.subtract(3, 1);
		assertTrue(sub == 2);
	}

	@Test
	void asubNegative() {
		calc = new Calculator();
		int sub = calc.subtract(3, 1);
		assertFalse(sub == 6);
	}
}
