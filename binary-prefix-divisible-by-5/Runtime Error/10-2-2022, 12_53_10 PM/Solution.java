// https://leetcode.com/problems/binary-prefix-divisible-by-5

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>l=new ArrayList<>();
        String s="";
        for(int i=0;i<nums.length;i++)
        {
            s+=Integer.toString(nums[i]);
        }
        int k=1;
        for(int i=0;i<nums.length;i++)
        {
            if(Integer.valueOf(s.substring(0,k),2)%5==0)l.add(true);
            else l.add(false);
            k+=1;
        }
        return l;
    }
}