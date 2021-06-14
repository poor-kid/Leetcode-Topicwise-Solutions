class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        if(n > 0)
            dp[1] = 1;
        
        for(int i=2;i<n+1;i++)
        {
            if(i%2 != 0)
                dp[i] = dp[i-1]+dp[1];
            else
                dp[i] = dp[i/2];
        }
        return dp;
        
    }
}