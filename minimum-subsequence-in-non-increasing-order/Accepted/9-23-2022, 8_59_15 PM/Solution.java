// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int c=nums[nums.length-1];
        int s=Arrays.stream(nums).sum();
        int i=nums.length-2;
        List<Integer>l=new ArrayList<>();
        l.add(nums[nums.length-1]);
        s-=c;
        while(c<=s)
        {
            c+=nums[i];
            s-=nums[i];
            l.add(nums[i]);
            i-=1;
        }
        return l;
    }
}