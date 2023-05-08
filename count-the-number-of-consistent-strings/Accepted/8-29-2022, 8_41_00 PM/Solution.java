// https://leetcode.com/problems/count-the-number-of-consistent-strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0,flag=1;
        for(int i=0;i<words.length;i++)
        {
           for(int j=0;j<words[i].length();j++)
           {
               if(allowed.contains(Character.toString(words[i].charAt(j)))==false)
               {
                   flag=0;break;
               }
           }
            if(flag==1)c+=1;
            else if(flag==0)flag=1;
        }
        return c;
    }
}