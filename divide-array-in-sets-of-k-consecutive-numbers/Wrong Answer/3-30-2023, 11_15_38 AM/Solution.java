// https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0)return false;
        int maxfreq=nums.length/k;
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i])==false)h.put(nums[i],1);
            else h.put(nums[i],h.get(nums[i])+1);
        }
        for(Map.Entry<Integer,Integer>e:h.entrySet())
        {
            if(e.getValue()>maxfreq)
                return false;
        }
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]-nums[i]>1)c=1;
            else c=0;
        }
        if(c==1)return false;
        return true;
        
    }
}