// https://leetcode.com/problems/contains-duplicate-ii

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            l.add(nums[i]);
        }
        List<Integer>sub;
        for(int i=0;i<nums.length;i++)
        {
            sub=new ArrayList<>();
            sub=l.subList(i+1,nums.length);
            //System.out.println(sub);
            int id=sub.indexOf(l.get(i));
            //System.out.println(id);
            if(id !=-1 && id+1<=k)return true;
            //else return false;
        }
        return false;
    }
}