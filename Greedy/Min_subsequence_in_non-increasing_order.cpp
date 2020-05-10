class Solution {
public:
    vector<int> minSubsequence(vector<int>& nums) {
        
        
        int len = nums.size();
        sort(nums.begin(),nums.end());
        vector<int> res;
        /*accumulate(vec.begin(),vec.end(),initial val) -- returns sum of elements */
        int sum = accumulate(nums.begin(),nums.end(),0);
        int curr=0,rem;
        for(int i=len-1;i>=0;i--)
        {
            curr +=nums[i];
            rem = sum-curr;
            //cout<<"sum "<<sum<<" rem "<<rem<<" curr "<<curr<<endl;
            res.push_back(nums[i]);
            if(rem < curr)
                return res;
        }
         return res;
    }
   
};