
/* Idea is to syore the indexes belonging to a particular group size in a map.
   now, iterate throught the map and split the vector in the map into equal vectors of size given(it->first)
   insert the values into vectors and the insert the parts into ans */ 


class Solution {
public:
    vector<vector<int>> groupThePeople(vector<int>& groupSizes) {
        
        unordered_map<int,vector<int>> map;
        int len = groupSizes.size();
        vector<vector<int>> res;
        for(int i=0;i<len;i++)
        {
           map[groupSizes[i]].push_back(i);
        }
        
         // for(auto it = map.begin();it != map.end();it++)
         // {
         //     cout<<it->first<<" arr: ";
         //     for(int val : it->second)
         //         cout<<val<<" ";
         //     cout<<endl;
         // }
        
         for(auto it = map.begin();it != map.end();it++)
        {
            int len = it->second.size();
            int groups = len/it->first;
             int indx=0,grpSize = it->first;
            while(groups)
            {
                vector<int> ans;
                int i;
                for( i =indx;i<indx+grpSize&&i<len;i++)
                {
                    ans.push_back(it->second[i]);
                }
                indx = i;
                res.push_back(ans);
                groups--;
            }
        }
        
        return res;
    }
};