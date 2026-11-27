// # **Problem 13: Longest Consecutive Sequence**

// Medium

// Arrays

// HashSet

// ## **Problem statement**

// Given an unsorted array of integers `nums`, find the length of the longest consecutive elements sequence.

// You must solve the problem in **O(n) time complexity**.

// ### **Example 1**

// ```
// Input: nums = [100, 4, 200, 1, 3, 2]

// Output: 4
// ```

// Explanation: The longest consecutive sequence is `[1, 2, 3, 4]`, and its length is `4`.

// ### **Example 2**

// ```
// Input: nums = [0, 3, 7, 2, 5, 8, 4, 6, 1]

// Output: 9
// ```

// Explanation: The longest consecutive sequence is `[0, 1, 2, 3, 4, 5, 6, 7, 8]`, and its length is `9`.

// ### **Example 3**

// ```
// Input: nums = [1, 0, 1, 2]

// Output: 3
// ```

// ## **Approach: HashSet**

// If we sort the array, we can find consecutive numbers, but sorting takes O(n log n).

// To achieve O(n), we use a `HashSet`, which provides average O(1) lookup.

// ### **Steps**

// 1. Insert all array elements into a HashSet.
// 2. Traverse the elements in the HashSet.
// 3. For every number, check whether `num - 1` exists.
// 4. If `num - 1` exists, the current number is not the beginning of a sequence, so skip it.
// 5. If `num - 1` does not exist, the current number is the beginning of a sequence.
// 6. Starting from that number, check how many consecutive numbers exist.
// 7. Update the maximum sequence length.

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Store all elements in the HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Traverse the HashSet
        for (int num : set) {

            // Check whether num is the start of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

                // Count consecutive elements
                while (set.contains(currentNum + 1)) {

                    currentNum++;
                    currentLength++;
                }

                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = { 100, 4, 200, 1, 3, 2 };

        int result = longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence: " + result);
    }
}