class Solution {
public:
    int minDeletionSize(vector<string>& A) {
        
        int count=0;
        int len = A[0].length();
        int vlen = A.size();
        
        for(int i=0;i<len;i++)
        {
            for(int j = 0;j<vlen-1;j++)
            {
                if(A[j][i] > A[j+1][i])
                {
                    count++;
                    break;
                }
            }
        }
        return count;
        
    }
};