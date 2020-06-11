package com.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums={3,2,4};
        int target=6;
        twoSumMap(nums,target);
        System.out.println(nums.toString());
    }

    public static int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <=nums.length-1; i++) {
            for (int j = i + 1; j <=nums.length-1; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
   /*for (Map.Entry<Integer,Integer> entries: map.entrySet()){
        entries.getKey();
        entries.getValue();
        }*/


/*
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }*/
