// Problem 9: Majority Element
// Easy
// Arrays
// Boyer–Moore Voting Algorithm

// Problem statement
// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than n / 2 times.

// You may assume that the majority element always exists in the array.
// Example 1
// Input: nums = [3,2,3]
// Output: 3


// Example 2
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2


// Approach: Boyer–Moore Voting Algorithm
// Instead of counting every element using a HashMap, we use two variables:
// - candidate – potential majority element.
// - count – tracks its vote balance.
// Steps:
// 1. Initialize count = 0.
// 2. Traverse the array.
// 3. If count == 0, choose the current element as the candidate.
// 4. If the current element equals the candidate, increment the count.
// 5. Otherwise, decrement the count.
// 6. Return the candidate.
// Because the majority element appears more than half the time, it will survive this voting process.
// Complete Java code
// Create a file named MajorityElement.java.
public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}


// Output
// Majority Element: 2


// Dry run
// Input: [2,2,1,1,1,2,2]
// Element	Candidate	Count	Action
// 2	2	1	Select candidate
// 2	2	2	Increment
// 1	2	1	Decrement
// 1	2	0	Decrement
// 1	1	1	New candidate
// 2	1	0	Decrement
// 2	2	1	New candidate

// Result: 2
// Complexity analysis
// - Time Complexity: O(n) – One traversal.
// - Space Complexity: O(1) – Only two variables.
// Concepts learned
// - Array traversal
// - Greedy approach
// - Boyer–Moore Voting Algorithm
// - Constant-space problem solving