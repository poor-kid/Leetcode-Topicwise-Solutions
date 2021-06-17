/*
You are given two lists of closed intervals, firstList and secondList, where firstList[i] = [starti, endi] and secondList[j] = [startj, endj]. Each list of intervals is pairwise disjoint and in sorted order.

Return the intersection of these two interval lists.

A closed interval [a, b] (with a < b) denotes the set of real numbers x with a <= x <= b.

The intersection of two closed intervals is a set of real numbers that are either empty or represented as a closed interval. For example, the intersection of [1, 3] and [2, 4] is [2, 3].

Input: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
*/


class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList == null || firstList.length == 0 || secondList == null || secondList.length == 0)
            return new int[][]{};
        List<int[]> res = new ArrayList<>();

        int left=0,right=0;
        int rightval, leftval;
        while(left < firstList.length  && right < secondList.length)
        {
            leftval = Math.max(firstList[left][0],secondList[right][0]);
            rightval = Math.min(firstList[left][1],secondList[right][1]);
            
            if(leftval <= rightval)
                res.add(new int[]{leftval,rightval});
            
            if(rightval == firstList[left][1])
                left++;
            if(rightval == secondList[right][1])
                right++;
        }
        
        return res.toArray(new int[res.size()][2]);
    }
}