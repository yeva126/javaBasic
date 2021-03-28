package com.company.leetCode;

import java.util.Arrays;

public class JZ59 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int start = 0, end = start + k - 1, i = 0;
        int[] maxArr = new int[nums.length];
        while(end < nums.length){
            maxArr[i++] = nums[end++] + nums[start+1] + nums[start];
        }
        int[] res =  Arrays.copyOfRange(maxArr, 0, i);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k = 3;
        maxSlidingWindow(nums, k);
    }
}
