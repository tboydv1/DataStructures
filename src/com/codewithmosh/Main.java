package com.codewithmosh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // write your code here
        //My implementation
        Array numbers = new Array(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.insert(4);
//        System.out.println("max element --> "+numbers.max());

        numbers.insertAt(30, 1);
        numbers.print();

        int[] arr2 = {39, 70, 30, 82};

//        System.out.println("Intersection --> "+ Arrays.toString(numbers.intersect(arr2)));





    }
}
