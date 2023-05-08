// https://leetcode.com/problems/search-insert-position

class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)l.add(nums[i]);
        if(l.indexOf(target)==-1)
        {
            l.add(target);
            Collections.sort(l);
            return l.indexOf(target);
        }
        else return l.indexOf(target);
    }
}