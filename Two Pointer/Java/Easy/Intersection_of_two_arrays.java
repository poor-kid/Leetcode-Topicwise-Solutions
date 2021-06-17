/* 
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
*/


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean memory[]=new boolean[1000];
        
        for(int num:nums1)
            memory[num]=true;
        
        int result[]=new int[nums1.length];
        int counter=0;
        
        for(int num:nums2){
            if(memory[num]==true){
                result[counter++]=num;
                memory[num]=false;                
            }
        }
     return Arrays.copyOf(result,counter); 
        
        
    }
}

/* -------------------- OR --------------------- */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        
        boolean[] check = new boolean[1000];
        
        for(int e : nums1)
            check[e] = true;
        
        for(int e: nums2)
        {
            if(check[e] && !res.contains(e))
                res.add(e);
        }
        
        int[] arr = res.stream().mapToInt(i->i).toArray();
        return arr;
        
        
    }
}


/* -------------------- OR --------------------- */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int left =0, right =0;
         while(left < nums1.length && right < nums2.length)
         {
             if(nums1[left] == nums2[right] && !res.contains(nums1[left]))
             {
                 res.add(nums1[left]);
                 left++;
                 right++;
             }
             else if(nums1[left] < nums2[right])
                 left++;
             else
                 right++;
         }
        
        int[] arr = res.stream().mapToInt(i->i).toArray();
        return arr;
        
        
    }
}

/* -------------------- OR --------------------- */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int e : nums1)
        {
            if(!map.containsKey(e))
                map.put(e,0);
        }
        
        for(int e : nums2)
        {
            if(map.containsKey(e) && !res.contains(e))
            {
                res.add(e);
            }
        }
        
        int[] arr = res.stream().mapToInt(i->i).toArray();
        return arr;
        
        
    }
}