class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> partitioned = new ArrayList<>();
        int len = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int maxSize = 0, prevSize =0;
        for(int i=0;i<len;i++)
        {
            map.put(s.charAt(i),i);
        }
        for(int i=0;i<len;i++)
        {
            prevSize++;
            int size = map.get(s.charAt(i));
            maxSize = Math.max(maxSize,size);
            if(i == maxSize)
            {
                partitioned.add(prevSize);
                prevSize = 0;
            }
        }
        return partitioned;
    }
}


/* ----------------- OR ------------------------ */

class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> partitioned = new ArrayList<>();
        int pointer = 0;
        Integer maxIndex = 0;
        int prevSize =0;
        while(pointer < s.length())
        {
            Integer index = s.lastIndexOf(s.charAt(pointer));
            while(pointer <= index )
            {
                maxIndex = Math.max(index,maxIndex);
                int index1 = 0;
                if(pointer+1 < maxIndex)
                     index1 = s.lastIndexOf(s.charAt(++pointer));
                else
                    break;
                if(index1 > index)
                    index = index1;
                
            }
            partitioned.add(maxIndex+1 - prevSize);
            pointer = maxIndex+1;
            prevSize = maxIndex+1;

        }
        return partitioned;
        
    }
}