class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] runningSum = new int[len];
        if(len >0)
            runningSum[0] = nums[0];
        for(int i =1 ; i<len; i++)
        {
            runningSum[i] = runningSum[i-1]+nums[i];
        }
        return runningSum;
        
    }
}