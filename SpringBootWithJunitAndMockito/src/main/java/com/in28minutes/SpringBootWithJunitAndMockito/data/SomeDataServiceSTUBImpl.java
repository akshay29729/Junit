package com.in28minutes.SpringBootWithJunitAndMockito.data;

public class SomeDataServiceSTUBImpl implements SomeDataService {
    @Override
    public int[] retrieveAll() {
        return new int[]{1,2,3};
    }
}
