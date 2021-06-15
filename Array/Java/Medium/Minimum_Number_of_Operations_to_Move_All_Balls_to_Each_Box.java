/*
You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball.

In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1. Note that after doing so, there may be more than one ball in some boxes.

Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box.

Each answer[i] is calculated considering the initial state of the boxes.
*/

class Solution {
    public int[] minOperations(String boxes) {

        int len = boxes.length(); 
        int[] res = new int[len];
        int[] dp_left = new int[len];
        dp_left[0] = 0;
        int prevOnes = 0;
        for(int i=1;i<len;i++)
        {
            if(boxes.charAt(i-1) == '1')
                prevOnes++;
            dp_left[i] = dp_left[i-1]+prevOnes;
        }
        
        int[] dp_right = new int[len];
        dp_right[len-1] = 0;
        prevOnes = 0;
        for(int i = len-2;i>=0;i--)
        {
            if(boxes.charAt(i+1) == '1')
                prevOnes++;
            dp_right[i] = dp_right[i+1]+prevOnes;
        }
        
        for(int i=0;i<len;i++)
        {
            res[i] = dp_left[i]+dp_right[i];
        }
        return res;
    }
}

/* -------------- OR ------------- */

class Solution {
    public int[] minOperations(String boxes) {

        int len = boxes.length();
        int[] res = new int[len];
        int rightSum = 0, leftSum = 0, onesAtRight =0, onesAtLeft=0;
        for(int i=0;i<len;i++)
        {
            if(boxes.charAt(i) == '1')
            {
                onesAtRight++;
                rightSum += i;
            }
                
        }
        
        for(int i=0;i<len;i++)
        {
            leftSum+=onesAtLeft;
            if(boxes.charAt(i)=='1')
            {
                onesAtLeft++;
                onesAtRight--;
            }
            res[i] = rightSum+leftSum;
            rightSum -=onesAtRight;
        }
        return res;
    }
}

/* ----------------- OR ------------------- */
class Solution {
    public int[] minOperations(String boxes) {

        int len = boxes.length();
        int[] res = new int[len];
        ArrayList<Integer> indexes = new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            if(boxes.charAt(i) == '1')
                indexes.add(i);
        }
        
        int count = indexes.size();
        for(int i=0;i<len;i++)
        {
            int moves = 0;
            for(int j=0;j<count;j++)
            {
                moves += Math.abs(i-indexes.get(j));
            }
            res[i] = moves;
        }
        return res;
    }
}