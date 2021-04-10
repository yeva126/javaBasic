package com.company.arrayListTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMain {
    public static void main(String[] args) {
        /*int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        System.arraycopy(arr, 0, arr, 3, 3);*/
        int[] arr = new int[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        int[] b = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr));
    }
}
