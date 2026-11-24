// ## **Problem 10: Rotate Array**

// Medium

// Array

// Reverse Algorithm

// ### **Problem statement**

// Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

// The rotation must be done **in-place**.

// ### **Example 1**

// ```
// Input: nums = [1,2,3,4,5,6,7], k = 3

// Output: [5,6,7,1,2,3,4]
// ```

// **Explanation:**

// Rotate the array to the right by 3 positions.

// ### **Example 2**

// ```
// Input: nums = [-1,-100,3,99], k = 2

// Output: [3,99,-1,-100]
// ```

// ### **Approach: Reverse Algorithm**

// Instead of shifting elements one by one, use the reversal technique.

// For `nums = [1,2,3,4,5,6,7]` and `k = 3`:

// 1\. Reverse the entire array.

// `[7,6,5,4,3,2,1]`

// 2\. Reverse the first `k` elements.

// `[5,6,7,4,3,2,1]`

// 3\. Reverse the remaining elements.

// `[5,6,7,1,2,3,4]
import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        if (n == 0) {
            return;
        }

        k = k % n;

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}