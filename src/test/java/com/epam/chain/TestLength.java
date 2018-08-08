package com.epam.chain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLength {
	
	public void testLength() {
		Chain one = new LengthChecker();
		String expected = "Password should be less than 20 and more than 8 characters in length.";
		assertEquals(expected,one.process("abdf"));
	}

}
