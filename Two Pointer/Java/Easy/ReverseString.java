class Solution {
    public void reverseString(char[] s) {
        int left =0, right = s.length-1;
        while(left < right)
        {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}

/* ----- 
    If the return type is string : String str = new StringBuilder(new String(s)).reverse().toString();
*/