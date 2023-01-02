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
public class E_StringHelperParameterized_BooleanTest {
	StringHelper helper =new StringHelper();

	private String actual;
	private String expected;
	
	

	public E_StringHelperParameterized_BooleanTest(String actual, String expected) {
		this.actual = actual;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<String[]> CollectionOfParameters() {
		String[][] parameters = {{"ABCD","false"},{"ABAB","true"},
				                 {"AB","true"},{"A","false"},{"","false"}};
		return Arrays.asList(parameters);
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_AllConditions() {
	
		String actualValue = String.valueOf(helper.areFirstAndLastTwoCharactersTheSame(actual));
		assertEquals(expected,actualValue);
	}
	
	
	// 2
//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeCondition() {
////		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
//		
//		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
//	}
//	
//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveCondition() {
////		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
//		
//		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
//	}
//	
//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame_TwoCharactersCondition() {
////		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
//		
//		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
//	}
//	
//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame_SingleCharacterCondition() {
////		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
//		
//		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
//	}
//	
//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame_EmptyStringCondition() {
////		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
//		
//		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(""));
//	}
}
