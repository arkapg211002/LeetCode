// https://leetcode.com/problems/keep-multiplying-found-values-by-two

class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            l.add(nums[i]);
        }
        while(true)
        {
            if(l.indexOf(original)!=-1)
            {
                original*=2;
            }
            else break;
        }
        return original;
        
    }
}