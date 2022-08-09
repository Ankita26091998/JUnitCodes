package com.junittutorial.mavenproject;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathServiceImplTest {

	@Mock
	private MathService mathService;

	@InjectMocks
	private MathServiceImpl mathServiceImpl = new MathServiceImpl();

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
//
//	@Test
//	public void doubleLongTest1() {
//		int expected = 40;
//		when(mathServiceImpl.doubleLong(20)).thenReturn(expected);
//		int result = mathServiceImpl.doubleLong(20);
//		assertEquals(40, result);
//		System.out.println("Result of doubleLong:" + result);
//	}
//
//	@Test
//	public void tripleLongTest2() {
//		long expected = 60;
//		Mockito.when(mathServiceImpl.tripleLong(20)).thenReturn(expected);
//		long result = mathServiceImpl.tripleLong(20);
//		assertEquals(60, result);
//		System.out.println("Result of tripleLong:" + result);
//	}
//
//	@Test
//	public void additionTest3() {
//		long expected = 10;
//		long arr[] = { 1, 2, 3, 4 };
//		Mockito.when(mathServiceImpl.addition(arr)).thenReturn(expected);
//		long result = mathServiceImpl.addition(arr);
//		assertEquals(10, result);
//		System.out.println("Result of addition:" + result);
//
//	}
}
