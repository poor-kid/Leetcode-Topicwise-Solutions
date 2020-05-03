class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        //To find max element in a vector (return iterator so "*" will return int)
        int max_candies = *max_element(candies.begin(),candies.end());
        
        vector<bool> res;
        for(int candy : candies)
        {
            if(candy < max_candies)
            {
                bool ans = ((candy+ extraCandies) >= max_candies) ? true : false;
                res.push_back(ans);
            }
            else
                res.push_back(true);
        }
        return res;
    }
};