// <!-- 3. Maximum Subarray Sum
// Medium
//  Kadane's Algorithm

// Problem statement
// Given an integer array, find the contiguous subarray that has the largest sum and return that sum.

// A subarray must contain at least one element.

// Example:
// Input:
// nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

// Output:
// 6


// Explanation:

// The maximum-sum subarray is:
// [4, -1, 2, 1]

// Sum = 4 - 1 + 2 + 1 = 6


// Approach: Kadane's Algorithm
// Kadane's Algorithm efficiently finds the maximum subarray sum.

// We maintain two variables:
// - currentSum: Maximum sum ending at the current position.
// - maxSum: Maximum sum found so far.
// At each position, decide whether to:
// - Extend the existing subarray.
// - Start a new subarray from the current element.
// Formula:
// \[
// currentSum = \max(nums[i], currentSum + nums[i])
// \]

// \[
// maxSum = \max(maxSum, currentSum)
// \] -->

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(
                nums[i],
                currentSum + nums[i]
            );

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {
            -2, 1, -3, 4, -1, 2, 1, -5, 4
        };

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}
