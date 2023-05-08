// https://leetcode.com/problems/two-furthest-houses-with-different-colors

class Solution {
    public int maxDistance(int[] colors) {
        int maxl=Integer.MIN_VALUE;
        int maxr=Integer.MIN_VALUE;
        for(int i=0;i<colors.length;i++)
        {
            if(colors[0]==colors[i])continue;
            maxl=(int)Math.max(maxl,i);
            if(colors[colors.length-1]==colors[colors.length-1-i])continue;
            maxr=(int)Math.max(maxr,colors.length-1-i);
        }
        return (int)Math.max(maxl,maxr);
    }
}