package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class C_ArraySortingTest {

	@Test
	public void testArraySorting() {
		int[] numbers = {12,4,6,1};
		Arrays.sort(numbers);
//		assertEquals(expected,numbers);
		
		assertArrayEquals(new int[] {1,4,6,12}, numbers);
		
   }
	
	@Test(expected=NullPointerException.class)
	public void testNullPointerException(){
		int[] numbers = null;
		int[] numbers1= {};
		
		// 1
//		try {
//			Arrays.sort(numbers);
//		}catch(Exception e) {
//			System.out.println("NPE Occurred...");
//		}
		
		//2 
		Arrays.sort(numbers);
//		Arrays.sort(numbers1);
	}
	
	@Test(timeout=1000)
//	@Test(timeout=100)
	public void testPerformanceForSorting() {
		int [] numbers = {12,4,6,1};
		for(int i=0;i<10000000;i++) {
			numbers[0]= i;
			Arrays.sort(numbers);
		}
	}
}