// https://leetcode.com/problems/minimum-suffix-flips

class Solution {
    public int minFlips(String target) {
        int s=0;
        char ch='0';
        for(int i=0;i<target.length();i++)
        {
            if(target.charAt(i)!=ch)
            {
                s+=1;
                ch=target.charAt(i);
            }
            
        }
        return s;
    }
}