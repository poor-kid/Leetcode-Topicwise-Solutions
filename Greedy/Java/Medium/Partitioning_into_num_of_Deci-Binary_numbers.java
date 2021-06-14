class Solution {
    public int minPartitions(String n) {
        return n.chars().max().getAsInt() -'0';
    }
}

/* -------------- OR ---------------*/
class Solution {
    public int minPartitions(String n) {
        int maxValue = 0;
        char maxChar = '0';
        for(char c : n.toCharArray())
        {
            if(c == '9')
                return c-'0';
            if(c > maxChar)
            {
                maxValue = c-'0';
                maxChar = c;
            }
        }
        return maxValue;
    }
}

/* ------------------- OR ----------------- */
class Solution {
    public int minPartitions(String n) {
        int[] arr = n.chars().map(c->c-'0').toArray();
        Arrays.sort(arr);
        return arr[n.length()-1];
    }
}