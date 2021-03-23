package com.company.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++){
            int flag = nums[i];
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                if (nums[k] + nums[j] == -flag){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    if (!res.contains(list)){
                        res.add(list);
                    }
                    j++;
                    k--;
                }else if(nums[k] + nums[j] + flag > 0){
                    k--;
                }else if(nums[k] + nums[j] + flag < 0){
                    j++;
                }
                if (nums[j] == nums[j-1]){
                    j++;
                    continue;
                }
                if (k < nums.length -1 && nums[k] == nums[k+1]){
                    k--;
                    continue;
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }
}
