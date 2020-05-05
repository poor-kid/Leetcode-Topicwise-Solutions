class Solution {
public:
    vector<int> sortedSquares(vector<int>& A) {
       
        int len =A.size();
        int left = 0, right = len-1;
        vector<int> res(len);
        for(int i = len-1;i>=0;i--)
        {
            int left_sqr = A[left]*A[left];
            int right_sqr =  A[right]*A[right];
            if(left_sqr >= right_sqr)
            {
                res[i] = left_sqr;
                left++;
            }
            else
            {
                res[i] = right_sqr;
                right--;
            }
            
        }
        return res;
    }
};