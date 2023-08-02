package com.in28minutes.SpringBootWithJunitAndMockito.buisness;

import com.in28minutes.SpringBootWithJunitAndMockito.data.SomeDataService;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SimpleBuisnessImpl {

    SomeDataService someDataService;

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    public int calculateSum(int[] array) {
        return Arrays.stream(array).reduce(Integer::sum).orElse(0);
//        int sum = 0;
//        for (int value : array) {
//            sum += value;
//        }
//        return sum;
    }

    public int calculateSum_UsingSomeDataService() {
//        int[] array = someDataService.retrieveAll();
//        int sum = 0;
//        for (int value : array) {
//            sum += value;
//        }
//        return sum;
        return Arrays.stream(someDataService.retrieveAll()).reduce(Integer::sum).orElse(0);
    }
}
