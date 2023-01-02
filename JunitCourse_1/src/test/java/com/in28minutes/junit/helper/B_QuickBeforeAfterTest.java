package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class B_QuickBeforeAfterTest {
	
	@BeforeClass
	public static void beforeClassPrerequirement() {
		System.out.println("Prerequirement for class is done...");
	}
	
	@AfterClass
	public static void afterClassPostRequirement() {
		System.out.println("Postrequirement for class is done...");
	}
	
	@Before
	public void beforeSetup() {
		System.out.println("Setup for testing is done...");
	}
	
	@After
	public void afterSetup() {
		System.out.println("Recovering the setup...");
	}
	

	@Test
	public void test1() {
		System.out.println("Test 1 is executed");
	}

	@Test
	public void test2() {
		System.out.println("Test 2 is executed");
	}
}
