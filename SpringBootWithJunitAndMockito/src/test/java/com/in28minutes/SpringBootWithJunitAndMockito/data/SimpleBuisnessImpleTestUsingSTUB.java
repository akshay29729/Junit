package com.in28minutes.SpringBootWithJunitAndMockito.data;

import com.in28minutes.SpringBootWithJunitAndMockito.buisness.SimpleBuisnessImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleBuisnessImpleTestUsingSTUB {
    @Test
    public void calculateSum_UsingDatService_basic(){
        SimpleBuisnessImpl simpleBuisness = new SimpleBuisnessImpl();
        simpleBuisness.setSomeDataService(new SomeDataServiceSTUBImpl());
        int actual = simpleBuisness.calculateSum_UsingSomeDataService();
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    public void calculateSum_UsingDatService_empty(){
        SimpleBuisnessImpl simpleBuisness = new SimpleBuisnessImpl();
        simpleBuisness.setSomeDataService(new SomeDataServiceSTUBImpl());
        int actual = simpleBuisness.calculateSum_UsingSomeDataService();
        int expected = 0;
        assertEquals(expected,actual);
    }

}
