package com.atguigu.springcloud.entities;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: test
 * @Author: SY
 * @Date: 2021/10/28 15:11
 * @Version 1.0
 */
public class test {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) {
            return new int[] {};
        }
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int ln0 = nums[left];
            int rn0 = nums[right];
            int ln1 = target - ln0;
            int rn1 = target - rn0;
            if(map.containsKey(ln1)) {
                return new int[] {left, map.get(ln1)};
            }
            else {
                map.put(ln0, left++);
            }
            if(map.containsKey(rn1)) {
                return new int[] {right, map.get(rn1)};
            }
            else {
                map.put(rn0, right--);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] a={2,5,5,11};
        int[] ints = new test().twoSum(a, 10);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
