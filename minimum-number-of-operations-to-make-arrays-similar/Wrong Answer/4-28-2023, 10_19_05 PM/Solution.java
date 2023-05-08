// https://leetcode.com/problems/minimum-number-of-operations-to-make-arrays-similar

class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        List<Integer>e1=new ArrayList<>();
        List<Integer>e2=new ArrayList<>();
        List<Integer>o1=new ArrayList<>();
        List<Integer>o2=new ArrayList<>();
        Arrays.sort(nums);
        Arrays.sort(target);
        int minop=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)e1.add(nums[i]);
            else o1.add(nums[i]);
            if(target[i]%2==0)e2.add(target[i]);
            else o2.add(target[i]);
        }
        for(int i=0;i<e1.size();i++)
        {
            if(e1.get(i)>e2.get(i)) minop+=(e1.get(i)-e2.get(i));
        }
        for(int i=0;i<o1.size();i++)
        {
            if(o1.get(i)>o2.get(i)) minop+=(o1.get(i)-o2.get(i));
        }
        return minop/2;
    }
}