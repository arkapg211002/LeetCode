// https://leetcode.com/problems/find-all-k-distant-indices-in-an-array

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==key)l.add(i);
        }
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<l.size();j++)
            {
                if((int)Math.abs(i-l.get(j))<=k)h.add(i);
                
            }
        }
        return (new ArrayList<Integer>(h));
    }
}