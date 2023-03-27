/*
* Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.
*/

public class PivotIndex {
    public static void main(String[] args) {
        int[] a ={1,7,3,6,5,6};
        System.out.println(pivotIndex(a));
    }


    public static int pivotIndex(int[] nums) {
        if (nums.length < 1) return -1;
        int allSum = 0;
        for (int a : nums) {
            allSum += a;
        }
        int tmp = 0;
        for (int i = 0; i < nums.length; ++i) {
            if ((allSum - (nums[i] + tmp)) == tmp) return i;
            tmp += nums[i];
        }
        return -1;
    }

}
