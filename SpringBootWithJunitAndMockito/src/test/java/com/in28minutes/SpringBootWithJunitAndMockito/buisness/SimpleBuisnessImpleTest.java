package com.in28minutes.SpringBootWithJunitAndMockito.buisness;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleBuisnessImpleTest {
    @Test
    public void calculateSum_basic(){
        SimpleBuisnessImpl simpleBuisness = new SimpleBuisnessImpl();
        int actual = simpleBuisness.calculateSum(new int[] {1,2,3});
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    public void calculateSum_empty(){
        SimpleBuisnessImpl simpleBuisness = new SimpleBuisnessImpl();
        int actual = simpleBuisness.calculateSum(new int[] {});
        int expected = 0;
        assertEquals(expected,actual);
    }

}
