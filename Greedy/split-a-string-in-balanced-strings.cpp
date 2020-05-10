class Solution {
public:
    int balancedStringSplit(string s) {
        int splits = 0;
        int count =0;
        for(char c : s)
        {
            if(c == 'R')
                count++;
            else
                count--;
            if(count == 0)
            {
                splits++;
            }
        }
        return splits;
        
    }
};