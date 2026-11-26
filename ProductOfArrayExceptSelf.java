// # **Problem 12: Product of Array Except Self**

// Medium

// Arrays

// Prefix & Suffix

// ## **Problem statement**

// Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all elements of `nums` except `nums[i]`.

// You must solve the problem **without using division** and in O(n) time complexity.

// ### **Example 1**

// ```
// Input:  nums = [1,2,3,4]
// Output: [24,12,8,6]
// ```

// Explanation:

// - Index 0: 2 × 3 × 4 = 24
// - Index 1: 1 × 3 × 4 = 12
// - Index 2: 1 × 2 × 4 = 8
// - Index 3: 1 × 2 × 3 = 6

// ### **Example 2**

// ```
// Input:  nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]
// ```

// ## **Approach: Prefix and Suffix Products**

// Instead of multiplying every element except the current one using nested loops, we use prefix and suffix products.

// - **Prefix product:** Product of all elements to the left of the current index.
// - **Suffix product:** Product of all elements to the right of the current index.

// The answer for each index is:

// \\[ answer[i] = prefix[i] \times suffix[i] \\]

// We can optimize this by storing prefix products directly in the answer array and calculating suffix products using a single variable.

// ### **Steps**

// 1. Create an answer array.
// 2. Initialize `prefix = 1`.
// 3. Traverse from left to right, storing the prefix product in `answer[i]`.
// 4. Initialize `suffix = 1`.
// 5. Traverse from right to left.
// 6. Multiply `answer[i]` by the suffix product.
// 7. Update the suffix product using the current element.

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // Calculate prefix products
        int prefix = 1;

        for (int i = 0; i < n; i++) {

            answer[i] = prefix;

            prefix *= nums[i];
        }

        // Calculate suffix products
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {

            answer[i] *= suffix;

            suffix *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4 };

        int[] result = productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }
}