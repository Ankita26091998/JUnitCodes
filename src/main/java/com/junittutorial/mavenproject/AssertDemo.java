package com.junittutorial.mavenproject;

import java.util.HashMap;

public class AssertDemo {
	public String getValue1(String key) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Red", "One");
		hm.put("Pink", "Two");
		hm.put("Blue", null);
		hm.put("Purple", "Two");
		return hm.get(key);
	}

	public String[] checkArray() {
		String sample[] = { "AA", "BB", "CC" };
		return sample;
	}
}
