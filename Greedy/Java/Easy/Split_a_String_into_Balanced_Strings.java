/*
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it in the maximum amount of balanced strings.

Return the maximum amount of split balanced strings.

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
*/

class Solution {
    public int balancedStringSplit(String s) {
        
        int maxSplit = 0;
        int count =0;
        for(char c : s.toCharArray())
        {
            if(c == 'R')
                count += -1;
            else if(c == 'L')
                count += 1;
            if(count == 0)
                maxSplit++;
        }
        
        return maxSplit;
    }
}