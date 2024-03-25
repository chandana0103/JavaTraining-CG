package com.test;

import static org.junit.Assert.assertEquals;
import com.service.Calculator;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CaluculatorTest {
	
	Calculator cal;

	@BeforeAll
	static void init() {
		System.out.println("intial setup...");
	}

	@AfterAll
	static void destory() {
		System.out.println("closed...");
	}

	@BeforeEach
	void setUp() {
		System.out.println("before each called...");
		cal = new Calculator();
	}

	@AfterEach
	void tearDown() {
		System.out.println("after each called...");
		cal = null;
	}

	@Test
	public void sumTest() {		
		System.out.println("Test method-1...");
		Calculator cal = new Calculator();
		int actualResult = cal.sum(50, 70);		
		assertEquals(120,actualResult);		
	}

	@Test
	public void sumTestWithTwoNegative() {	
		System.out.println("Test method-2...");
		Calculator cal = new Calculator();
		int actualResult = cal.sum(-20, -30);		
		assertEquals(-50,actualResult);		
	}

	@Test
	public void sumTestWithPositiveNegative() {		
		System.out.println("Test method-3...");
		Calculator cal = new Calculator();
		int actualResult = cal.sum(20, -30);		
		assertEquals(-10,actualResult);		
	}
}

