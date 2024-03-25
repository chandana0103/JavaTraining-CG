package com.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.service.DemoService;

public class DemServiceTest {

	DemoService demoService;
	
	@BeforeEach
	public void setUp() {
		demoService= new DemoService();
	}	

	@BeforeEach
	public void teardown() {
		demoService= null;
	}	
	
	@Test
	public void isPalindromTestTrue() {		
		boolean actualResult = demoService.isPalindrom(1001);
		assertTrue(actualResult);
	}
	
	@Test
	public void isPalindromTestFalse() {		
		boolean actualResult = demoService.isPalindrom(1234);
		assertFalse(actualResult);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1001,1221,0000,4444})
	public void isPalindromTest(int value) {
		boolean actualResult = demoService.isPalindrom(value);
		assertTrue(actualResult);
	}
		
	
	@Test
	void sortTest() {
		
//		int[] inputAry = {20,55,30,10,32};		
//		int[] actual = demoService.sort(inputAry);
//		int[] expected = {10,20,30,32,55};		
//		assertArrayEquals(expected,actual);
		
		int[] actual = demoService.sort(new int[]{20,55,30,10,32});
		assertArrayEquals(new int[]{10,20,30,32,55},actual);		
	}	
	
	@Test
	void divisonWithoutException() {
		
		String actual = demoService.divison(20, 10);
		assertEquals("2",actual);
	}

	@Disabled
	@Test
	void divisonWithException() {			
		assertThrows(ArithmeticException.class,()->  demoService.divison(20, 0));
	}
	
	
}
