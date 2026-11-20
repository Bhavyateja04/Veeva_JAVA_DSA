// # Problem statement
// # Given an integer array nums, move all 0s to the end of the array while maintaining the relative order of the non-zero elements.

// # You must do this in-place, without making a copy of the array.
// # Example 1
// # Input:  [0, 1, 0, 3, 12]
// # Output: [1, 3, 12, 0, 0]


// # Example 2
// # Input:  [0, 0, 1]
// # Output: [1, 0, 0]


// # Approach: Two Pointers
// # - Use a pointer index to track where the next non-zero element should be placed.
// # - Traverse the array.
// # - Whenever a non-zero element is found, swap it with the element at index.
// # - Increment index.


import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;

                index++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
