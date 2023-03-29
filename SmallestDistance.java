/*
You are given two integers, x and y, which represent your current location on a Cartesian grid: (x, y).
You are also given an array points where each points[i] = [ai, bi] represents that a point exists at (ai, bi).
A point is valid if it shares the same x-coordinate or the same y-coordinate as your location.

Return the index (0-indexed) of the valid point with the smallest Manhattan distance from your current location.
If there are multiple, return the valid point with the smallest index. If there are no valid points, return -1.

The Manhattan distance between two points (x1, y1) and (x2, y2) is abs(x1 - x2) + abs(y1 - y2).
*/

import java.util.Arrays;

public class SmallestDistance {

    public static void main(String[] args) {
        int x = 3, y = 4;
        int[][] points = {{1,2},{3,1},{2,4},{2,3},{4,4}};
        System.out.println(nearestValidPoint(x, y, points));
    }
  
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int dist = Integer.MAX_VALUE, result = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; ++i) {
            if (points[i][0] == x || points[i][1] == y) {
                int count = (Math.abs(x - points[i][0])) + (Math.abs(y - points[i][1]));
                if (count < dist || (count == dist && i < result)) {
                    dist = count;
                    result = i;
                }
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
