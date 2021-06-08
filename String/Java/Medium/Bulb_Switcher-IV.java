/* 
    Input: target = "10111"
    Output: 3
    Explanation: Initial configuration "00000".
    flip from the third bulb:  "00000" -> "00111"
    flip from the first bulb:  "00111" -> "11000"
    flip from the second bulb:  "11000" -> "10111"
    We need at least 3 flip operations to form target.

    Approach1:
        In the initail state all the lights are in 'OFF' State (00000..). So If the target starts with '0'
        we can ignore until we see first '1' (ON State) 'coz the initial state covers the stae where the bulbs are off.

        Let's say : The bulb combinations can be:
        00......0 => 0 -> no flips required (same as initial state)
        11......1 => 1 -> 1 flip required 
        00..11..0 => 11..0 => 10 -> 2 flips required (All the prefix '0's are ignored since it matches with initail state 
        nd all the consecutive '1's can be flipped in 1-turn which is equal to flipping a single 'ON' bulb so all the consecutive '1's can be replaced with single '1')
        11...00.1 => 100.1 => 101 -> 3 flips (combination of 10 and 1) 

    Approach 2:
        eg: 10111
        maintain a state with '0' as initial
        Traverse from left to right checking each target bulb state
        if the state of the bulb matches with target bulb state => flips = 0
        else if the state of the bulb doen't match with target bulb state => flips++

*/


class Solution {
    private int countOccurance(String text, String str)
    {
        int count = 0, fromIndex = 0;
        
        while ((fromIndex = str.indexOf(text, fromIndex)) != -1 ){
            count++;
            fromIndex++;
            
        }
        return count;
    }
    public int minFlips(String target) {
        int len = target.length();
        int count = countOccurance("10", target);

        //Number of flips required for 10 + if last bulb is 1 => 1 flip or if it is 0 => 0 flips
        int flips = 2 * count + (target.charAt(len-1) == '1'? 1:0);
        return flips;
    }
    
}

/* -------------- OR --------------------- */
class Solution {
    public int minFlips(String target) {
        
        char currStatus = '0';
        int flips = 0;
        
        for(int i=0;i<target.length(); i++)
        {
            if(currStatus != target.charAt(i))
            {
                flips++;
                currStatus = currStatus == '0'?'1':'0';
            }
        }
        return flips;
        
    }
}