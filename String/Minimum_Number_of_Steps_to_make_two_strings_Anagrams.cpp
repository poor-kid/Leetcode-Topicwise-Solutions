class Solution {
public:
    int minSteps(string s, string t) {
        int count = 0;
        int len = s.length();
        unordered_map<char,int> map;
        for(int i=0;i<len;i++)
        {
            map[s[i]]++;
        }
        int t_len =  t.length();
        for(int i=0;i<t_len;i++)
        {
           auto it = map.find(t[i]);         
            if( it == map.end() || it->second == 0)
                count++;
            else
                it->second--;
        }
        return count;
        
    }
};