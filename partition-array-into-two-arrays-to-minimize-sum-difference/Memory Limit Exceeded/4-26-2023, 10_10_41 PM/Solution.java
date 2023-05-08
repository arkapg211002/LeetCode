// https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference

class Solution {
    public int minimumDifference(int[] nums) {
        int sum=0;
        
        for(int i=0; i<nums.length; i++)
            sum+=nums[i];
        
        List<Integer> list=new ArrayList<>();
        f(nums, 0, 0, 0, list);
        
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<=list.size()/2; i++) 
            ans=Math.min(ans, Math.abs(sum-list.get(i)-list.get(i)));
        
        return ans;
    }
    void f(int[] nums, int i, int sum, int l, List<Integer> list) {
        if(l == nums.length/2) {
            list.add(sum);
            return;
        }
        if(i == nums.length) 
            return;
        
        f(nums, i+1, sum+nums[i], l+1, list);
        f(nums, i+1, sum, l, list);
    }
}