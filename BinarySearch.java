// 4. Binary Search
// Easy
//  Searching

// Problem statement
// Given a sorted integer array and a target value, find the index of the target.

// If the target is not present, return -1.

// Example:
// Input:
// nums = [-1, 0, 3, 5, 9, 12]
// target = 9

// Output:
// 4


// Explanation:

// The element 9 is present at index 4.
// Approach: Binary Search
// Binary Search works on a sorted array.

// Instead of checking every element, repeatedly divide the search space into two halves.

// Steps:
// 1. Initialize low = 0.
// 2. Initialize high = nums.length - 1.
// 3. Calculate the middle index.
// 4. If the middle element equals the target, return its index.
// 5. If the middle element is smaller, search the right half.
// 6. Otherwise, search the left half.
// 7. Repeat until the element is found or the search space becomes empty.

public class BinarySearch {

    public static int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            else if (nums[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};

        int target = 9;

        int result = search(nums, target);

        System.out.println("Target Index: " + result);
    }
}
