// https://leetcode.com/problems/shortest-distance-to-a-character

class Solution {
    public int[] shortestToChar(String s, char c) {
        int a[]=new int[s.length()];
        if(s.indexOf(c)==-1)return a;
        for(int i=0;i<s.length();i++)
        {
            String sub1=s.substring(0,i);
            String sub2=s.substring(i);
            int li=sub1.lastIndexOf(c);
            int ri=sub2.indexOf(c);
            if(li==-1)a[i]=ri;
            else if(ri==-1)a[i]=(int)Math.abs(i-li);
            else a[i]=(int)Math.min(Math.abs(li-i),ri);
        }
        return a;
    }
}