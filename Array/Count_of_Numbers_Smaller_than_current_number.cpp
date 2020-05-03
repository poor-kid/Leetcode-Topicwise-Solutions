class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        int len = nums.size();
        
        vector<int>prefix_arr(101);
        vector<int>freq(101);
        /* Find Frequence of each element */
        for(int i=0;i<len;i++)
        {
            freq[nums[i]]++;
        }
       
        /*prefix sum can be calculated by adding prefix_sum[prev_ele]+freq[prev_ele]*/
        for(int i=1;i<101;i++)
        {
            prefix_arr[i] = prefix_arr[i-1]+freq[i-1];
        }
        /*for each index in nums insert the count of smaller numbers*/
        for(int i=0;i<len;i++)
        {
            nums[i] = prefix_arr[nums[i]];
        }
        return nums;
    }
};