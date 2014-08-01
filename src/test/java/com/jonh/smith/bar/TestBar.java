package com.jonh.smith.bar;

import junit.framework.TestCase;

public class TestBar extends TestCase {

	public void testDefaultBar() {
		Bar bar = new Bar();
		assertEquals("Bar", bar.doBar());
	}
}
