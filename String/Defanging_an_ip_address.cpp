class Solution {
public:
    string defangIPaddr(string address) {
        int len = address.length();
        string str;
        /* Appending to String */
        for(int i=0;i<len;i++)
        { 
            if(address[i] == '.')
            {
                str += '[';
                str += '.';
                str += ']';
            }
            else
                str += address[i];
        }
        return str;
    }
};