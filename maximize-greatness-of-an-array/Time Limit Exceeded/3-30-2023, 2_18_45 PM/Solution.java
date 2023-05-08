// https://leetcode.com/problems/maximize-greatness-of-an-array

class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)l.add(nums[i]);
        System.out.println(l);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<l.size();j++)
            {
                if(nums[i]<l.get(j))
                {
                    l.remove(j);
                    //System.out.println(l);
                    c+=1;
                    break;
                }
            }
        }
        return c;
    }
}