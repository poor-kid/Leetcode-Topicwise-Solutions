class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffleArray = new int[2*n];
        int secPointer = n, newPointer =0;
        for(int i=0; i<n; i++)
        {
            shuffleArray[newPointer++] = nums[i];
            shuffleArray[newPointer++] = nums[secPointer++];
        }
        return shuffleArray;
    }
}