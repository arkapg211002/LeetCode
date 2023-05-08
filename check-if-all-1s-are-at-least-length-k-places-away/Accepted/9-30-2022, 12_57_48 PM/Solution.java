// https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away

class Solution {
    public boolean kLengthApart(int[] nums, int k) 
    {
        var c=k;
        for(var num:nums)
        {
            if(num==1)
            {
                if(c<k)return false;
                c=0;
            }
            else c+=1;
        }
        return true;
    }
}