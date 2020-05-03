class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        int len = nums.size();
        vector<int>temp(nums);
        sort(temp.begin(),temp.end());
        unordered_map<int,int> map;
        /*Inserting the indeces of sorted array in HashMap */
        for(int i=0;i<len;i++)
        {
            auto it = map.find(temp[i]);
            if(it == map.end())
                map[temp[i]] = i;
        }
        /*Index of the particular element in sorted array will give the smaller numbers than current */
        vector<int> res(len);
        for(int i=0;i<len;i++)
        {
            res[i] = map[nums[i]];
        }
        return res;
    }
};

















/*class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        int len = nums.size();
        
        vector<int>prefix_arr(101);
        vector<int>freq(101);
        // Find Frequence of each element 
        for(int i=0;i<len;i++)
        {
            freq[nums[i]]++;
        }
       
        prefix sum can be calculated by adding prefix_sum[prev_ele]+freq[prev_ele]
        for(int i=1;i<101;i++)
        {
            prefix_arr[i] = prefix_arr[i-1]+freq[i-1];
        }
        //for each index in nums insert the count of smaller numbers
        for(int i=0;i<len;i++)
        {
            nums[i] = prefix_arr[nums[i]];
        }
        return nums;
    }
};*/