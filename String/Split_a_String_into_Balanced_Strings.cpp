class Solution {
public:
    int balancedStringSplit(string s) {
        stack<char> st;
        int len = s.length();
        int count = 0;
        for(int i=0;i<len;i++)
        {
            if(st.empty() )
                st.push(s[i]);
            else if((st.top() == 'L' && s[i] == 'L') || (st.top() == 'R' && s[i] == 'R'))
                st.push(s[i]);
            else
            {
                st.pop();
                if(st.empty())
                    count++;
            }
        }
        return count;
    }
};