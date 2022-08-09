package com.junittutorial.mavenproject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AssertDemoTest {
	AssertDemo aa = new AssertDemo();

	@Test
	public void checkIfNull() {
		assertNull(null, aa.getValue1("Blue"));
	}

	@Test
	public void checkIfNotNull() {
		assertNotNull(null, aa.getValue1("Red"));
	}

	@Test
	public void checkIfSame() {
		assertSame(aa.getValue1("Pink"), aa.getValue1("Purple"));
	}

	@Test
	public void checkIfNotSame() {
		assertNotSame(aa.getValue1("Red"), aa.getValue1("Blue"));
	}

	@Test
	public void checkArraySame() {
		String expected[] = { "AA", "BB", "CC" };
		assertArrayEquals(expected, aa.checkArray());
	}

}
