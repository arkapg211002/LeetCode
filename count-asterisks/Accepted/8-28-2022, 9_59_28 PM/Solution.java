// https://leetcode.com/problems/count-asterisks

class Solution {
    public int countAsterisks(String s) {
       int flag=0;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='|' && flag==0)
            {
                flag=1;continue;
            }
            else if(s.charAt(i)=='|' && flag==1)
            {
                flag=0;continue;
            }
            if(flag==0 && s.charAt(i)=='*')c+=1;
        }
        return c;
    }
}