// 5. Merge Intervals
// Medium
//  Sorting + Arrays

// Problem statement
// Given an array of intervals where each interval contains a start and end value, merge all overlapping intervals.

// Return an array of non-overlapping intervals that cover all the original intervals.

// Example:
// Input:
// intervals = [
//     [1, 3],
//     [2, 6],
//     [8, 10],
//     [15, 18]
// ]

// Output:
// [
//     [1, 6],
//     [8, 10],
//     [15, 18]
// ]


// Explanation:
// - [1,3] and [2,6] overlap.
// - Therefore, merge them into [1,6].
// - [8,10] does not overlap with [1,6].
// - [15,18] also remains separate.
// Approach: Sorting
// 1. Sort all intervals based on their starting values.
// 2. Create a result list.
// 3. Add the first interval to the result.
// 4. Compare the next interval with the last interval in the result.
// 5. If they overlap, merge them by updating the ending value.
// 6. Otherwise, add the new interval separately.
// Two intervals overlap when:
// \[
// currentStart \leq previousEnd
// \]

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        if (intervals.length == 0) {
            return new int[0][0];
        }

        Arrays.sort(intervals,
            (a, b) -> Integer.compare(a[0], b[0])
        );

        List<int[]> result = new ArrayList<>();

        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            int[] current = intervals[i];

            int[] previous = result.get(result.size() - 1);

            if (current[0] <= previous[1]) {

                previous[1] = Math.max(
                    previous[1],
                    current[1]
                );

            } else {

                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] result = merge(intervals);

        System.out.println("Merged Intervals:");

        for (int[] interval : result) {

            System.out.println(
                Arrays.toString(interval)
            );
        }
    }
}
