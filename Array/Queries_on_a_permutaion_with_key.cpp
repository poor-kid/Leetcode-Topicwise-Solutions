class Solution {
    int findIndex(vector<int> &permute,int val)
    {
        auto it = find(permute.begin(),permute.end(),val);
        int index = distance(permute.begin(),it);
        return index;
    }
public:
    vector<int> processQueries(vector<int>& queries, int m) {
        int len = queries.size();
        vector<int>permute(m);
        vector<int>res(len);
        for(int i=1;i<=m;i++)
            permute[i-1] = i;
        
        for(int i=0;i<len;i++)
        {
            int index = findIndex(permute,queries[i]);
            res[i] = index;
            int temp = permute[index];
            permute.erase(permute.begin()+index);
            permute.insert(permute.begin(),temp);
        }
        return res;
    }
};