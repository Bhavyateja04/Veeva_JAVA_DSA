// 1. Two Sum
// Easy
//  Array + HashMap

// Problem statement
// Given an integer array nums and an integer target, return the indices of the two numbers whose sum equals the target.

// You cannot use the same element twice.

// Assume that exactly one valid answer exists.

// Example:
// Input:
// nums = [2, 7, 11, 15]
// target = 9

// Output:
// [0, 1]


// Explanation:
// - nums[0] = 2
// - nums[1] = 7
// - 2 + 7 = 9
// - Therefore, return indices [0, 1].
// Approach: HashMap
// Instead of checking every possible pair using two loops, use a HashMap.

// For every element:
// 1. Calculate the required number: target - nums[i].
// 2. Check whether that number already exists in the HashMap.
// 3. If it exists, return its index and the current index.
// 4. Otherwise, store the current number and its index.

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
