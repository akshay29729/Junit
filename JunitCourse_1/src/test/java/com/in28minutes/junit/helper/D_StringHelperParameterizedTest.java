package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class D_StringHelperParameterizedTest {
	StringHelper helper =new StringHelper();

	private String actual;
	private String expected;
	
	

	public D_StringHelperParameterizedTest(String actual, String expected) {
		this.actual = actual;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<String[]> CollectionOfParameters() {
		String[][] parameters = {{"AACD","CD"},{"ACD","CD"}};
		return Arrays.asList(parameters);
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		
		assertEquals(expected,helper.truncateAInFirst2Positions(actual));
	}
	
	//2
//	@Test
//	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
//		
//		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
//	}
//	
//	@Test
//	public void testTruncateAInFirst2Positions_AinFirstPosition() {
//		
//		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
//	}
}
