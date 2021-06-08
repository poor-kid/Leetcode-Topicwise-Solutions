class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        Map<Character,Integer> lValue = new HashMap<>();
        for(char c ='a'; c<='j'; c++)
        {
            lValue.put(c, c-'a');
        }
        int firstSum = 0,secSum=0, totalSum =0,targetSum =0, len1 = firstWord.length(), len2 = secondWord.length();
        for(int i=0;i<len1; i++)
        {
            firstSum = firstSum*10 + lValue.get(firstWord.charAt(i));
            
        } 
        for(int i=0;i<len2;i++)
        {
            secSum = secSum*10 + lValue.get(secondWord.charAt(i));
        }
        totalSum = firstSum+secSum;
        for(int i=0;i<targetWord.length(); i++)
        {
            targetSum = targetSum*10 + lValue.get(targetWord.charAt(i));
        }
        if(totalSum == targetSum)
            return true;
        return false;
    }
}