package com.junittutorial.mavenproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BasicAnnotationTest {
	@BeforeClass
	public static void runBeforeClass() {
		System.out.println("Inside @BeforeClass method ");
	}

	@AfterClass
	public static void runAfterClass() {
		System.out.println("Inside @AfterClass method ");
	}

	@Before
	public void runBeforeTestMethod() {
		System.out.println("Inside @Before method ");
	}

	@After
	public void runAfterTestMethod() {
		System.out.println("Inside @After method ");
	}

	@Test(timeout = 100)
	public void method_1() {
		System.out.println("Inside @Test1 method ");
	}

	@Test(timeout = 400)
	public void method_3() {
		System.out.println("Inside @Test3 method ");
	}

	@Ignore
	public void method_2() {
		System.out.println("Inside @Ignore method ");
	}

}