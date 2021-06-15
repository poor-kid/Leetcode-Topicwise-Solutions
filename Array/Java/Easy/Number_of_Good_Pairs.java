/* 
Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed
*/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            if(map.containsKey(num))
            {
                int val = map.get(num);
                map.put(num,++val);
            }
            else
                map.put(num,1);
        }
        //map.keySet() - to get all keys
        for(Integer num : map.values())
        {
            goodPairs += num*(num-1)/2;
        }

        return goodPairs;
    }
}

/* ---------- OR ---------- */
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            if(map.containsKey(num))
            {
                int val = map.get(num);
                map.put(num,++val);
            }
            else
                map.put(num,1);
        }
        
        for(Integer num : map.values())
        {
            goodPairs += num*(num-1)/2;
        }

        return goodPairs;
    }
}

/* ---------- OR ---------- */

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            if(map.containsKey(num))
            {
                int val = map.get(num);
                map.put(num,++val);
            }
            else
                map.put(num,1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int val = entry.getValue();
            goodPairs += val*(val-1)/2;
        }

        return goodPairs;
    }
}

/* ---------- OR ---------- */
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            if(map.containsKey(num))
            {
                int val = map.get(num);
                map.put(num,++val);
            }
            else
                map.put(num,1);
        }
        
        Iterator it = map.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer,Integer> entry = (Map.Entry)it.next();
            int val = entry.getValue();
            goodPairs += val*(val-1)/2;
        }

        return goodPairs;
    }
}

/* ---------- OR ---------- */
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int goodPairs = 0;
        for(int num : nums)
            count[num]++;
        for(int c: count)
            goodPairs += c*(c-1)/2;
        return goodPairs;
    }
}
