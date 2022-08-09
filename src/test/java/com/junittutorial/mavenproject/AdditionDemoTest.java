package com.junittutorial.mavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AdditionDemoTest {
	@Test
	public void addTest() {
		int result = AdditionDemo.add(30, 50);
		System.out.println("Addition result is: " + result);
		assertEquals(80, result);
	}

	@Test
	public void subTest() {
		int result = AdditionDemo.sub(80, 50);
		System.out.println("Substraction result is: " + result);
		assertEquals(30, result);
	}

	@Test
	public void mulTest() {
		int result = AdditionDemo.mul(30, 50);
		System.out.println("Multiplication result is: " + result);
		assertEquals(1500, result);
	}
}
