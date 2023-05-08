// https://leetcode.com/problems/find-target-indices-after-sorting-array

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        
        List<Integer>l=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==target)l.add(i);
        }
        Collections.sort(l);
        return l;
    }
}