// https://leetcode.com/problems/height-checker

class Solution {
    public int heightChecker(int[] heights) {
        int a[]=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            a[i]=heights[i];
        }
        int c=0;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=heights[i])c+=1;
        }
        return c;
    }
}