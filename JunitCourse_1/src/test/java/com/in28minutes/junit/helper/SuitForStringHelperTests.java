package com.in28minutes.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ D_StringHelperParameterizedTest.class, A_StringHelperTest.class })
public class SuitForStringHelperTests {

}
