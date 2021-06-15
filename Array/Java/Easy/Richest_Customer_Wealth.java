/* 
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0, cols = accounts[0].length;
        for(int[] customer : accounts)
        {
            int sum = 0;
            for(int i=0;i<cols;i++)
            {
                sum += customer[i];
            }
            wealth = Math.max(wealth,sum);
        }
        return wealth;
    }
}