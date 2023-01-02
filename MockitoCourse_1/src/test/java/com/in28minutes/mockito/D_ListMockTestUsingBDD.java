package com.in28minutes.mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class D_ListMockTestUsingBDD {

	@Test
	public void testMockList_SizeusingBDD() {
		// Given
		List list = mock(List.class);
		given(list.size()).willReturn(2);
		
		// when
		int i = list.size();
		
		// then
		assertThat(i,is(2));
	}
	
	@Test
	public void testMockList_getUsingBDD() {
		
		//Given
		List list = mock(List.class);
		given(list.get(0)).willReturn("Akshay");
		
		//When
		String output = (String) list.get(anyInt());
		
		//Then
		assertThat(output,is("Akshay"));
	}
	
}
