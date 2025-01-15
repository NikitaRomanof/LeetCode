/*
1493. Longest Subarray of 1's After Deleting One Element
Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

Example 1:
Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.

Example 2:
Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].

Example 3:
Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.

Constraints:

    1 <= nums.length <= 105
    nums[i] is either 0 or 1.

*/

class LongestSubarrayOfFirstAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int tmp = 0;
        int zeroPos = 0;
        boolean flag = true;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                ++tmp;
            } else if (nums[i] == 0 && i + 1 < nums.length && nums[i + 1] == 0) {
                max = max < tmp ? tmp : max;
                tmp = 0;
                flag = true;
            } else if (nums[i] == 0 && i + 1 < nums.length && nums[i + 1] == 1) {
                if (tmp == 0) {
                } else if (flag) {
                    flag = false;
                    zeroPos = i;
                } else {
                    flag = true;
                    max = max < tmp ? tmp : max;
                    tmp = 0;
                    i = zeroPos;
                }
            }
            if (i == nums.length - 1) {
                max = max < tmp ? tmp : max;
            }
        }
        return max == nums.length ? max - 1 : max;
    }
}
