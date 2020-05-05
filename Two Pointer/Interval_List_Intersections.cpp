class Solution {
public:
    vector<vector<int>> intervalIntersection(vector<vector<int>>& A, vector<vector<int>>& B) {
        vector<vector<int>> res;
        int A_ptr = 0, B_ptr =0;
        int len1 = A.size();
        int len2 = B.size();
        while(A_ptr < len1 && B_ptr < len2)
        {
            int low = max(A[A_ptr][0],B[B_ptr][0]);
            int high = min(A[A_ptr][1],B[B_ptr][1]);
            if(low <= high)
                res.push_back({low,high});
            
            if(A[A_ptr][1] < B[B_ptr][1])
                A_ptr++;
            else
                B_ptr++;
        }
        
        return res;
        
    }
};