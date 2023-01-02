package com.in28minutes.mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class C_ListMockTest {

	@Test
	public void testMockList_Size() {
		List list = mock(List.class);
		
		when(list.size()).thenReturn(2);
		
		assertEquals(2,list.size());
		assertEquals(null,list.get(0));
	}
	
	@Test
	public void testMockList_get() {
		List list = mock(List.class);
		
		when(list.get(0)).thenReturn("Akshay");
		
		assertEquals("Akshay",list.get(0));
		assertEquals(null,list.get(1));
	}
	
	@Test
	public void testMockList_getAnyInt() {
		List list = mock(List.class);
		
		when(list.get(anyInt())).thenReturn("Akshay");
		
		assertEquals("Akshay",list.get(0));
		assertEquals("Akshay",list.get(1));
		assertEquals("Akshay",list.get(100));
	}
	
	@Test(expected=RuntimeException.class)
	public void testMockList_ThrowException() {
		List list = mock(List.class);
		
		when(list.get(anyInt())).thenThrow(new RuntimeException("Something went wrong.."));
		
		assertEquals("Akshay",list.get(0));
	}

}
