class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        int len = nums.size();
        vector<int>decompressed;
        
        for(int i=0;i<len;i+=2)
        {
            /*vector.insert(position,size,value) */
            decompressed.insert(decompressed.end(),nums[i],nums[i+1]);
        }
        return decompressed;
    }
};








/*class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        int len = nums.size();
        vector<int>decompressed;
        
        for(int i=0;i<len;i+=2)
        {
            for(int j =0;j<nums[i];j++)
            {
                decompressed.push_back(nums[i+1]);
            }
        }
        return decompressed;
    }
};*/