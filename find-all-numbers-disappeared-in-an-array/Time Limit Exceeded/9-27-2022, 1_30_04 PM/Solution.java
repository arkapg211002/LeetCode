// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>l=new ArrayList<>();
        int n=nums.length;
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            h.add(nums[i]);
        }
        List<Integer>a=new ArrayList<>(h);
        for(int i=1;i<=n;i++)
        {
            if(a.indexOf(i)==-1)l.add(i);
        }
        return l;
    }
}