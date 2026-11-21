// Problem 8: Remove Duplicates from Sorted Array
// Easy
// Arrays
// Two Pointers

// Problem statement
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.

// Return the number of unique elements k.

// The first k elements of the array should contain the unique elements in their original order.

// You must modify the array in-place.
// Example 1
// Input:  [1,1,2]
// Output: 2

// Modified array: [1,2,_]


// Example 2
// Input:  [0,0,1,1,1,2,2,3,3,4]
// Output: 5

// Modified array: [0,1,2,3,4,_,_,_,_,_]


// Approach: Two Pointers
// We use two pointers:
// - i – tracks the position of the last unique element.
// - j – traverses the array to find the next unique element.
// Steps:
// 1. If the array is empty, return 0.
// 2. Start i at 0.
// 3. Traverse using j from 1.
// 4. Whenever nums[j] != nums[i], increment i.
// 5. Assign nums[j] to nums[i].
// 6. Return i + 1.

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {

                i++;

                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicates(nums);

        System.out.println("Unique count: " + k);

        System.out.println("Unique elements: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}