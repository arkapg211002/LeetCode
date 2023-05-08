// https://leetcode.com/problems/rearrange-array-to-maximize-prefix-score

class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int a[]=new int[nums.length],k=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            a[k]=nums[i];
            k+=1;
        }
        long pre[]=new long[nums.length];
        pre[0]=(long)a[0];
        int c=0;
        if(pre[0]>0)c+=1;
        for(int i=1;i<nums.length;i++)
        {
            pre[i]=(long)a[i]+pre[i-1];
            if(pre[i]>0)c+=1;
        }
        return c;
    }
}