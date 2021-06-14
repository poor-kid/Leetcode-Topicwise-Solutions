
/* 
    Any number will have only Odd Numbers as Divisord and Subtracting Odd Number from Odd Number will always give even number

    This eventually leads to num: 2
    any one who gets 2 wins and 1 loses.
*/

class Solution {
    public boolean divisorGame(int n) {
        if(n%2 == 0)
            return true;
        return false;
        
    }
}


/* --------------- OR ---------- */
class Solution {
    public boolean divisorGame(int n) {
        boolean[] dp = new boolean[n+1];
        dp[0] = false;
        dp[1] = false;
        
        for(int i=2;i<=n;i++)
        {
            for(int j = 1; j<i;j++)
            {
                if(i%j == 0)
                    if(dp[i-j] == false)
                        dp[i] = true;
            }
        }
        return  dp[n];
        
    }
}