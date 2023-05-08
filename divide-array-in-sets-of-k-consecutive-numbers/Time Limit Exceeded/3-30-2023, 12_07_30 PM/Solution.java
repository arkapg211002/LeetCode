// https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)l.add(nums[i]);
        Collections.sort(l);
        for(int i=0;i<l.size();i++)
        {
            int c=0;
            for(int j=1;j<=k-1;j++)
            {
                if(l.contains(l.get(i)+j)==true)
                {   l.remove(Integer.valueOf(l.get(i)+j));
                    c+=1;
                }
            }
            l.remove(i);
            i--;
            //System.out.println(l);
            if(c!=k-1)return false;
            
        }
        if(l.isEmpty()==true)return true;
        else return false;
    }
}