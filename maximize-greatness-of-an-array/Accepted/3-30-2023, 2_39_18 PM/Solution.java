// https://leetcode.com/problems/maximize-greatness-of-an-array

class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int c=0,l=0,r=1;
        while(r<=nums.length-1)
        {
            if(nums[l]<nums[r])
            {
                c+=1;
                l+=1;
                r+=1;
            }
            else r+=1;
        }
        return c;
    }
}