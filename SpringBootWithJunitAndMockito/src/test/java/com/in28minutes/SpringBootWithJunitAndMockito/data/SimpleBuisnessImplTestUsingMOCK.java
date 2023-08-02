package com.in28minutes.SpringBootWithJunitAndMockito.data;

import com.in28minutes.SpringBootWithJunitAndMockito.buisness.SimpleBuisnessImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SimpleBuisnessImplTestUsingMOCK {

    @Mock
    private SomeDataService someDataServiceMock;
    @InjectMocks
    private SimpleBuisnessImpl simpleBuisness;

    @Test
    public void calculateSum_UsingDatService_basic(){
        when(someDataServiceMock.retrieveAll()).thenReturn(new int[] {1,2,3});
        assertEquals(6, simpleBuisness.calculateSum_UsingSomeDataService());
    }

    @Test
    public void calculateSum_UsingDatService_empty(){
        when(someDataServiceMock.retrieveAll()).thenReturn(new int[] {});
        assertEquals(0, simpleBuisness.calculateSum_UsingSomeDataService());
    }

}
