package com.nsum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lizhangyu
 * @date 2021/3/31 21:05
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 3, 6};

        int target = 9;

        int[] t = twoSum(nums, target);

        System.out.println(Arrays.toString(t));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];

            if (map.containsKey(rest)) {
                return new int[]{i, map.get(rest)};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("no result for the input");
    }
}
