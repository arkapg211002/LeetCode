// https://leetcode.com/problems/maximum-value-of-a-string-in-an-array

class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        for(int i=0;i<strs.length;i++)
        {
            int n=0;
            try
            {
                n=Integer.parseInt(strs[i]);
            }
            catch(Exception e)
            {
                n=strs[i].length();
            }
            max=(int)Math.max(n,max);
        }
        return max;
    }
}