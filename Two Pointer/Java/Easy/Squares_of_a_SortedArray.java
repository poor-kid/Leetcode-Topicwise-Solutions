/* -------- O(N) ------ */

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] sortedArr = new int[nums.length];
        int left =0, right = nums.length -1 , i= nums.length-1;
        while(left<= right)
        {
            if(Math.abs(nums[left]) > Math.abs(nums[right]))
            {
                sortedArr[i] = nums[left] * nums[left];
                left++;
            }
            else
            {
                sortedArr[i] = nums[right] * nums[right];
                right--;
            }
            i--;
        }
        return sortedArr;
        
    }
}

/* ----- OR -------------- */
/* O(NlogN) */

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i< nums.length; i++)
        {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
        
    }
}