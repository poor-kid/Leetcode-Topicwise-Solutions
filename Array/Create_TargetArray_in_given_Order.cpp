class Solution {
public:
    vector<int> createTargetArray(vector<int>& nums, vector<int>& index) {
        int len = index.size();
        vector<int> target;
        
        for(int i=0;i<len;i++)
        {
        	/*vector.insert(position,value) */
            target.insert(target.begin()+index[i],nums[i]);
        }
        return target;
    }
};