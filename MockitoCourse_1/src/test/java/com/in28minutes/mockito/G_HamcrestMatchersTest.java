package com.in28minutes.mockito;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class G_HamcrestMatchersTest {

	@Test
	public void testHamcrestMatchersMethods() {
		// List
		List<Integer> list = Arrays.asList(90,101,110,111);
		assertThat(list,hasSize(4));
		assertThat(list,hasItems(90,111));
		assertThat(list,everyItem(greaterThan(80)));
		assertThat(list,everyItem(lessThan(180)));
		
		// String
		assertThat("",isEmptyString());
		assertThat(null,isEmptyOrNullString());
		
		// Arrays
		Integer[] array = {1,2,3};
		assertThat(array,arrayWithSize(3));
		assertThat(array,arrayContaining(1,2,3));
		assertThat(array,arrayContainingInAnyOrder(3,2,1));
		
	}

}
