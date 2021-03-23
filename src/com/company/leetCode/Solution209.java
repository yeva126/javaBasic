package com.company.leetCode;

import java.util.HashSet;
import java.util.Set;

public class Solution209 {

    public static int minSubArrayLen(int target, int[] nums) {
        //滑动窗口
        int len = Integer.MAX_VALUE, start = 0, end = 0;
        while(end < nums.length){
            target -= nums[end++];
            while(target <= 0){
                len = len<(end-start)?len:(end-start);
                target += nums[start++];
            }
        }
        return len == Integer.MAX_VALUE?0:len;
        /*暴力*/
        /*int len = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int count = nums[i];
            int num = 1;
            if (count == target){
                len=1;
                continue;
            }
            for(int j = i+1; j <nums.length; j++){
                if(count + nums[j] < target){
                    count+=nums[j];
                    num++;
                }else if(count + nums[j] >= target){
                    num++;
                    len = num<len?num:len;
                    break;
                }
            }
        }
        if (len == Integer.MAX_VALUE){
            return 0;
        }
        return len;*/
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }
}
