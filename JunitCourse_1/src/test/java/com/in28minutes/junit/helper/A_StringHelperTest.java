package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A_StringHelperTest {
	StringHelper helper;
	
	@Before
	public void createNewInstanceForEachTest() {
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinLast2Position() {
		
		assertEquals("CDAA",helper.truncateAInFirst2Positions("CDAA"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinSecondPosition() {
		
		assertEquals("CD",helper.truncateAInFirst2Positions("CAD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_withoutA() {
		
		assertEquals("CDEF",helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeCondition() {
//		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveCondition() {
//		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_TwoCharactersCondition() {
//		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_SingleCharacterCondition() {
//		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_EmptyStringCondition() {
//		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(""));
	}
}
