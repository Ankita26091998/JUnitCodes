package com.junittutorial.mavenproject;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class TestList {

	@Test
	public void testList_ReturnsSingle_value() {

		List mocklist = mock(List.class);
//		when(mocklist.size()).thenReturn(1);
		when(mocklist.get(0)).thenReturn("Hi");
		when(mocklist.get(1)).thenReturn("Hello");
		when(mocklist.get(2)).thenReturn("Good");
		when(mocklist.get(3)).thenReturn("Morning!");

//		assertEquals(1, mocklist.size());
		assertEquals("Hi", mocklist.get(0));

//		System.out.println(mocklist.size());
		System.out.println("Value at 0th index: " + mocklist.get(0));
		System.out.println(mocklist);
	}
}