// https://leetcode.com/problems/percentage-of-letter-in-string

class Solution {
    public int percentageLetter(String s, char letter) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==letter)c+=1;
        }
        
        return (int)((c*1.0*100)/(s.length()*1.0));
    }
}