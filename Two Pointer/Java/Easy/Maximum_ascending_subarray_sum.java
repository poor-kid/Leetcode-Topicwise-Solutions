/* 
Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.

A subarray is defined as a contiguous sequence of numbers in an array.

A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi < numsi+1. Note that a subarray of size 1 is ascending.

Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
*/

class Solution {
    public int maxAscendingSum(int[] nums) {
        int len = nums.length;
        int maxsum = 0, sum =0, left =0;
        
        while(left+1 < len)
        {
            if(nums[left] < nums[left+1])
            {
                sum += nums[left];
                left++;
            }
            else{
                sum += nums[left];
                maxsum = Math.max(maxsum,sum);
                sum =0;
                left++;
            }
        }
        sum += nums[left];
        maxsum = Math.max(maxsum,sum);
        return maxsum;
    }
}