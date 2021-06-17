/*
You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

 

Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
*/

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int count = 0;
        int index = 0;
        if (ruleKey.equals("color")) index = 1;
        if (ruleKey.equals("name")) index = 2;
        for (List<String> list : items) {
            if (list.get(index).equals(ruleValue)) count++;
        }
        return count;
    }
}

/* ----------------- OR --------------------- */
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int count = 0;
        for(List<String> str : items)
        {
            switch(ruleKey){
                case "type":
                    if(str.get(0).equals(ruleValue))
                        count++;
                    break;
                case "color":
                    if(str.get(1).equals(ruleValue))
                        count++;
                    break;
                case "name":
                    if(str.get(2).equals(ruleValue))
                        count++;
                    break;
                default:
                    break;
            }
        }
        return count;
    }
}

/* -------------------------- OR ----------------------- */
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("type",0);
        map.put("color",1);
        map.put("name",2);
        
        int count = 0;
        for(List<String> str : items)
        {
            if(str.get(map.get(ruleKey)).equals(ruleValue))
                count++;
        }
        return count;
    }
}