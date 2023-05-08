// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses

class Solution {
    public int maxDepth(String s) {
        int max=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')c+=1;
            if(c>max)max=c;
            if(s.charAt(i)==')')c-=1;
        }
        return max;
    }
}