
/* The Idea is to store the highest index of each character
    and iterate through the string and increase the size of patition Greedily */


/*optimized solution */
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






























class Solution {
public:
    vector<int> partitionLabels(string S) {
        
        vector<int> res;
        int len = S.length();
        
        unordered_map<char,int> map;
        /*array indeces starts from 0 but we need length */
        int high_index=1;
        int start_index;
        
        for(int i=0;i<len;i++)
            map[S[i]] = i;
        
        int low_index = 0;
        while(low_index < len)
        {
            start_index = low_index;
            high_index = map[S[low_index]];
            while(low_index <= high_index)
            {
                if(map[S[low_index]] > high_index)
                    high_index = max(map[S[low_index]], high_index);
                low_index++;
            }
            
         //   cout<<"index_len "<<index_len<<" left "<<left<<" i "<<i<<" start "<<start_index<<endl;
            
            int ans;
            ans = low_index-start_index;
            res.push_back(ans);
        }
        return res;
    }
};