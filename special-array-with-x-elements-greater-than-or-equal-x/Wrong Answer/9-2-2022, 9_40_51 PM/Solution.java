// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x

class Solution {
    public int specialArray(int[] nums) {
        int zc=0;
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)zc+=1;
            else l.add(nums[i]);
        }
        if(zc==nums.length)return -1;
        int n=l.size();
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i)<n)return -1;
        }
        return n;
    }
}