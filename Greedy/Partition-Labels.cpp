
/*Idea is to store the max index of each character in a map,
  now while iterating through the string update the max_index according to that particular character
  if lowindex == maxindex then the partition is complete, Now Update low index and store size of partition */

class Solution {
public:
    vector<int> partitionLabels(string S) {
        
        vector<int> res;
        int len = S.length();
        
        unordered_map<char,int> map;
        int high_index=0;
        int start_index= 0;
        
        for(int i=0;i<len;i++)
            map[S[i]] = i;
        
        int low_index = 0;
        while(low_index < len)
        {
            
            high_index =  max(map[S[low_index]], high_index);
            
            //cout<<"high_index "<<high_index<<" low_index "<<low_index<<" start "<<start_index<<endl;
            int ans;
            if(low_index == high_index)
            {
                 ans = low_index-start_index+1;
                 res.push_back(ans);
                start_index = low_index+1;
            }
            low_index++;
           
        }
        return res;
    }
};