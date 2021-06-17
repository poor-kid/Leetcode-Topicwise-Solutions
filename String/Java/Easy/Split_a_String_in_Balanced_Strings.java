/* 
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it in the maximum amount of balanced strings.

Return the maximum amount of split balanced strings.

 

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
*/

class Solution {
    public int balancedStringSplit(String s) {
        int count = 0, ptr =0;
        for(char c : s.toCharArray())
        {
            if(c == 'R')
                ptr += -1;
            else
                ptr += 1;
            if(ptr == 0)
                count++;
        }
        return count;
        
    }
}