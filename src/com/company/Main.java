package com.company;

import java.util.*;

public class Main {
    public static int[] twoSum(int[] numbers, int target) {
        int n = 0;
        int []solution = new int[2];

        for(int i = numbers.length-1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(numbers[j] + numbers[i] == target && numbers[j] != numbers[i]){
                    solution[0] = j+1;
                    solution[1] = i+1;
                    break;
                }
            }
        }
        return solution;
    }

    public static void main(String[] args) {
	// write your code here
        int nums1[] = {-1,0};
        twoSum(nums1, -1);

       /* List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            if ("a".equals(item)){
                iterator.remove();
            }
        }
        System.out.println(list);*/
    }
}
