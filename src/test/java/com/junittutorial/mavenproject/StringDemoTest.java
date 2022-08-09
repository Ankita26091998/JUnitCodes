package com.junittutorial.mavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringDemoTest {

	@Test
	public void stringTest1() {
		String str = "are";
		boolean result = StringDemo.checkString(str);
		System.out.println("contains result is: " + result);
		assertEquals(true, result);
	}

	@Test
	public void stringTest2() {
		String str = "Hello";
		boolean result = StringDemo.checkString1(str);
		System.out.println("equals result is: " + result);
		assertEquals(true, result);
	}

}
