package com.in28minutes.SpringBootWithJunitAndMockito.buisness;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ListMockTest {
    List mockList = mock(List.class);
    @Test
    public void listBasic(){
        when(mockList.size()).thenReturn(3);
        assertEquals(3,mockList.size());
    }

    @Test
    public void list_multipleReturn(){
        when(mockList.size()).thenReturn(3).thenReturn(4);
        assertEquals(3,mockList.size());
        assertEquals(4,mockList.size());
    }
    @Test
    public void list_getBasic(){
        when(mockList.get(0)).thenReturn("Akshay");
        assertEquals("Akshay",mockList.get(0));
    }

    @Test
    public void list_getAnyInt(){
        when(mockList.get(anyInt())).thenReturn("Akshay");
        assertEquals("Akshay",mockList.get(0));
        assertEquals("Akshay",mockList.get(22));
    }

    List<String> mockList2 = mock(List.class);
    @Test
    public void verificationCalls(){
        String s1 = mockList2.get(0);
        String s2 = mockList2.get(1);

        verify(mockList2).get(0);
        verify(mockList2,times(2)).get(anyInt());
        verify(mockList2,atLeast(1)).get(anyInt());
    }

    @Test
    public void argumentCapturing(){
        mockList2.add("Akshay");
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        verify(mockList2).add(captor.capture());

        assertEquals("Akshay",captor.getValue());
    }

    @Test
    public void multipleArgumentCapturing(){
        mockList2.add("Akshay");
        mockList2.add("Shinde");
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        verify(mockList2,times(2)).add(captor.capture());

        assertEquals("Akshay",captor.getAllValues().get(0));
        assertEquals("Shinde",captor.getAllValues().get(1));
    }
}
