package org.bmi.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BMIServiceTests {
	
	static BMIService service;

	@BeforeAll
	static void setUp() {
		System.out.println("setup...");
		service = new BMIService();
	}
	
	@Test
	void test() {
		System.out.println(service);
		assertNotNull(service);
	}
	
	@Test
	void test2() {
		//18.51
		double bmi  = service.calculate(1.8, 60);
		System.out.println(bmi);
		assertEquals(bmi, 18.51);
	}

}