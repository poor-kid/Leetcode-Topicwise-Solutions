class Solution {
public:
    vector<string> findAndReplacePattern(vector<string>& words, string pattern) {
      
        vector<string> res;
        
        int len = words.size();
        int p_len = pattern.length();
        for(int i=0;i<len;i++)
        {
            int j;
            unordered_map<char,char> map;
            vector<int> chars(27);
            for(j=0;j<p_len;j++)
            {
                auto it = map.find(pattern[j]);
                if(it == map.end()) 
                {
                    if(!chars[words[i][j] - 'a'])
                    {
                        map[pattern[j]] = words[i][j];
                        chars[(words[i][j] - 'a')] = 1 ;
                    }
                    else
                        break;
                    
                }
                else if(it != map.end())
                {
                    if(it->second != words[i][j])
                       break;
                }
            }
            
            if(j == p_len)
                res.push_back(words[i]);
            
        }
        return res;
    }
};