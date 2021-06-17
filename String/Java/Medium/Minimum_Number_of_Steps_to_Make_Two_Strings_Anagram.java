/*
Given two equal-size strings s and t. In one step you can choose any character of t and replace it with another character.

Return the minimum number of steps to make t an anagram of s.

An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.

 

Example 1:

Input: s = "bab", t = "aba"
Output: 1
Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.

Input: s = "leetcode", t = "practice"
Output: 5
Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
*/

class Solution {
    public int minSteps(String s, String t) {
        int[] count = new int[26];
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        int sum = 0;
        for(int i=0;i<26;i++)
        {
            if(count[i]>0)
                sum+= count[i];
        }
        return sum;
    }
}

/* ------------------------ OR -------------------------- */

class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray())
        {
            int val = 0;
            if(map.containsKey(c))
            {
                map.put(c, map.get(c) +1);
            }
            else
                map.put(c,1);
        }
        for(char c: t.toCharArray())
        {
            if(map.containsKey(c))
            {
                int val = map.get(c);
                if(val != 0)
                    map.put(c,--val);
            }
        }
        int sum = 0;
        for(int val : map.values())
        {
            sum+= val;
        }
        return sum;
    }
}