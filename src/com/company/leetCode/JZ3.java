package com.company.leetCode;

import java.util.HashSet;
import java.util.Set;

public class JZ3 {
    public static int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
            String a = "we are never ever getting back together";
            a.replace(" ", "%20");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findRepeatNumber(new int[]{0,1,2,11,3,4,5,6,7,8,9,10,11,12,13}));
    }
}
