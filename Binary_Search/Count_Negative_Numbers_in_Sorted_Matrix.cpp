class Solution {
    
    int binarySearch(vector<int> &row)
    {
        int len = row.size();
        int left = 0,right = len-1;
        int mid,res = -1;
        while(left <= right)
        {
            mid = left + (right-left)/2;
            if(row[mid] < 0 )
            {
                res =  mid;
                right = mid-1;
            }
            else if(row[mid] < -1)
                right = mid-1;
            else
                left = mid+1;
                
        }
        return res;
    }
public:
    int countNegatives(vector<vector<int>>& grid) {
        int rows = grid.size();
        int cols = grid[0].size();
        
        int count =0,index;
        for(vector<int> row : grid)
        {
            int len = row.size();
             index =binarySearch(row);
            //cout<<index<<endl;
            if(index != -1)
                count += len - index;
            else
                count +=0;
            
        }
        return count;
    }
};