class Solution {
    public String interpret(String command) {
        
        String al = "(al)", o ="()";
        StringBuilder finalString = new StringBuilder();
        int i =0;
        while(i< command.length())
        {
            if(command.charAt(i) == 'G')
            {
                finalString.append("G");
                i++;
            }
            else if(o.equals(command.substring(i,i + o.length()))) 
            {
                finalString.append("o");
                i += o.length();
            }
            else if(al.equals(command.substring(i,i + al.length())))
            {
                finalString.append("al");
                i += al.length();
            }
            else
                break;
        }
        return finalString.toString();
        
    }
}

/* ----------------- OR ------------------------ */
class Solution {
    public String interpret(String command) {
         String finalStr = command.replaceAll("\\(\\)","o");
         finalStr = finalStr.replaceAll("\\(al\\)","al");
         return finalStr;
        
    }
}