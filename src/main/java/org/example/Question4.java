package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Question4 {

    public static void main(String[] args) {
        int[][] interval1 = {{1,2},{2,3},{3,4},{1,3}};
        int[][] interval2 = {{1,2},{1,2},{1,2}};
        int[][] interval3 = {{1,2},{2,3}};

        System.out.println(eraseOverlapIntervals(interval1));
        System.out.println(eraseOverlapIntervals(interval2));
        System.out.println(eraseOverlapIntervals(interval3));
    }

    public static int eraseOverlapIntervals(int[][] intervals){
        if (intervals.length <= 1) {
            return 0; // No overlaps with one or fewer intervals
        }

        // Sort intervals by their end times, prioritizing earlier endings
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int count = 0; // Count of removed intervals
        int prevEnd = intervals[0][1]; // End time of the previous non-overlapping interval

        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            if (current[0] >= prevEnd) { // No overlap with the previous interval
                prevEnd = current[1]; // Update the ending time
            } else {
                count++; // Overlap detected, remove the current interval
            }
        }

        return count;
    }
}
