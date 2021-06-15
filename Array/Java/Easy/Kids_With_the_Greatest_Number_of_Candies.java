/* 
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: 
Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids. 
Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids. 
Kid 3 has 5 candies and this is already the greatest number of candies among the kids. 
Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies. 
Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids. 
*/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        List<Boolean> canMaxCandies = new ArrayList<>();
        for(int c : candies)
        {
            maxCandies = Math.max(maxCandies,c);
        }
        for(int c : candies)
        {
            if(c+extraCandies >= maxCandies)
                canMaxCandies.add(true);
            else
                canMaxCandies.add(false);
        }
        return canMaxCandies;
        
    }
}