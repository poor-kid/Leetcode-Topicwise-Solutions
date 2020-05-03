class Solution {
public:
    int numTeams(vector<int>& rating) {
        int len = rating.size();
        int count = 0;
        
        /* We are focusing on middle element here: The number of teams formed can be found by 
        1. Counting the number of soldier ratings that are fit for jth place using given condition                             (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k])  */
        
        for(int j=0;j<len-1;j++)
        {
            int leftSmaller = 0,leftGreater = 0;
            int rightSmaller = 0,rightGreater = 0;
            for(int i=0;i<j;i++)
            {
                if(rating[i] < rating[j])
                    leftSmaller++;
                else if(rating[i] > rating[j])
                    leftGreater++;
            }
            
            for(int k = j+1;k<len;k++)
            {
                if(rating[j] < rating[k] )
                    rightGreater++;
                else if(rating[j] > rating[k])
                    rightSmaller++;
            }
            
            count += leftSmaller * rightGreater + leftGreater * rightSmaller;
        }
        return count;
    }
};