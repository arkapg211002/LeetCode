// https://leetcode.com/problems/rings-and-rods

class Solution {
    public int countPoints(String rings) {
        int a[][]=new int[10][3];
        for(int i=1;i<rings.length();i+=2)
        {
            if(rings.charAt(i-1)=='B')a[i][0]+=1;
            else if(rings.charAt(i-1)=='R')a[i][1]+=1;
            else if(rings.charAt(i-1)=='G')a[i][2]+=1;
        }
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i][0]==1 && a[i][1]==1 && a[i][2]==1)c+=1;
        }
        return c;
    }
}