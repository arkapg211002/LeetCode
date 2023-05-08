// https://leetcode.com/problems/sort-array-by-parity

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer>l=new ArrayList<>();
        List<Integer>m=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)l.add(nums[i]);
            else m.add(nums[i]);
            
        }
        l.addAll(m);
        
        int a[]=new int[nums.length];
        for(int i=0;i<l.size();i++)
        {
            a[i]=l.get(i);
        }
        return a;
    }
}