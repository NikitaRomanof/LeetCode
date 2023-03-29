/*
Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths.
If it is impossible to form any triangle of a non-zero area, return 0.

** the largest edge of the triangle must be less than the sum of the other edges of the triangle
** наибольшее ребро треугольника должно быть меньше суммы остальных ребер треугольника
*/

import java.util.Arrays;

public class LargestPerimeter {

    public static void main(String[] args) {
        int[] a = {2, 1, 2};
        System.out.println(largestPerimeter(a));
    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int i = 0, big = 0;
        for (; (i + 2) < nums.length; ++i) {
            if (nums[i + 2] < (nums[i + 1] + nums[i])) big = nums[i + 2] + nums[i + 1] + nums[i];
        }
        return big;
    }
}
