class Solution {
    
public:
    int findNumbers(vector<int>& nums) {
        int count = 0;
        int len = nums.size();
        for(int i=0;i<len;i++)
        {
            int val = nums[i];
            if((val >=10 && val<=99) || (val>=1000 && val<=9999 || (val >= 100000)))
                count++;
        }
        return count;
    }
};












/*class Solution {
    int countDigits(int num)
    {
        int count=0;
        while(num)
        {            
            num = num/10;
            count++;
        }
        return count;
    }
public:
    int findNumbers(vector<int>& nums) {
        int count = 0;
        int len = nums.size();
        for(int i=0;i<len;i++)
        {
            int digits = countDigits(nums[i]);
            if(digits%2 == 0)
                count++;
        }
        return count;
    }
};*/