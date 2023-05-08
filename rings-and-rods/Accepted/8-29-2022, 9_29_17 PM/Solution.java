// https://leetcode.com/problems/rings-and-rods

class Solution {
    public int countPoints(String rings) {
        int a[][]=new int[10][3];
        int index=0;
        for(int i=1;i<rings.length();i+=2)
        {
            index=(int)rings.charAt(i)-48;
            //System.out.println(index);
            if(rings.charAt(i-1)=='B')a[index][0]+=1;
            else if(rings.charAt(i-1)=='R')a[index][1]+=1;
            else if(rings.charAt(i-1)=='G')a[index][2]+=1;
        }
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i][0]!=0 && a[i][1]!=0 && a[i][2]!=0)c+=1;
        }
        return c;
    }
}