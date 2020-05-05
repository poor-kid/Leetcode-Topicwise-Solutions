class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> res;
        unordered_set<int> set(nums1.begin(),nums1.end());
        int len = nums2.size();
        
        for(int i=0;i<len;i++)
        {
            if(set.count(nums2[i]))
            {
                res.push_back(nums2[i]);
                set.erase(nums2[i]);
            }
        }
        
        return res;
        
    }
};