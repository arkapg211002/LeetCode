// https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter

class Solution {
    public int minTimeToType(String word) {
        int co=0;
        char p='a';
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            int l=(int)Math.abs((int)ch-(int)p);
            int r=(int)Math.abs(((int)ch+26)-(int)p);
            int r1=(int)Math.abs((int)ch-((int)p+26));
            r=(int)Math.min(r,r1);
            //System.out.println(l+" "+r);
            co+=(int)Math.min(l,r)+1;
            p=ch;
        }
        return co;
    }
}