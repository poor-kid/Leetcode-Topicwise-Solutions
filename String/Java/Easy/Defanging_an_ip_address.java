class Solution {
    public String defangIPaddr(String address) {
        char[] array = address.toCharArray();
        StringBuilder str = new StringBuilder();
        for(char c: array)
        {
            if(c == '.')
            {
                str.append("[.]");
            }
            else{
                str.append(c);
            }
        }
        return str.toString();
        
    }
}

/* -------------- OR -------------- */

class Solution {
    public String defangIPaddr(String address) {
        String defangedIp = address.replaceAll("\\.","[.]");
        return defangedIp;
        
    }
}

/* -------------- OR -------------- */
class Solution {
    public String defangIPaddr(String address) {
        String defangedIp = address.replace(".","[.]");
        return defangedIp;
        
    }
}

/* -------------- OR -------------- */

class Solution {
    public String defangIPaddr(String address) {
        String defangedIp = String.join("[.]",address.split("\\."));
        return defangedIp;
        
    }
}