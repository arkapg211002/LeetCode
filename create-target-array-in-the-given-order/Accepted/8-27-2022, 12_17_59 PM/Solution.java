// https://leetcode.com/problems/create-target-array-in-the-given-order

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> t=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            t.add(index[i],nums[i]);
        }
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a[i]=t.get(i);
        }
        return a;
    }
}