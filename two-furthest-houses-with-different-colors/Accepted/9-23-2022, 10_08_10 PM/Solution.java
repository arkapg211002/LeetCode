// https://leetcode.com/problems/two-furthest-houses-with-different-colors

class Solution {
    public int maxDistance(int[] colors) {
        int maxl=Integer.MIN_VALUE;
        int maxr=Integer.MIN_VALUE;
        int i=0,j=colors.length-1;
        while(i<colors.length && j>=0)
        {
            if(colors[0]!=colors[i])maxl=(int)Math.max(maxl,i);
            if(colors[colors.length-1]!=colors[j])maxr=(int)Math.max(maxr,colors.length-1-j);
            i+=1;j-=1;
        }
        return (int)Math.max(maxl,maxr);
    }
}