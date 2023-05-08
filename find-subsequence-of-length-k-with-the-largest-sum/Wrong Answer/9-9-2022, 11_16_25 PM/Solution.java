// https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        List<Integer>l=new ArrayList<>();
        //List<Integer>r=new ArrayList<>();
        List<Integer>a=new ArrayList<>();
        int b[]=new int[k];
        for(int i=0;i<nums.length;i++)
        {
            l.add(nums[i]);
            //r.add(nums[i]);
        }
        Collections.sort(l);
        Collections.reverse(l);
        //System.out.println(l);
       int j=0;int c=k;
        while(k>0)
        {
            a.add(l.get(j));
            j+=1;
            k-=1;
        }
        j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(a.contains(nums[i])==true && j<c)
            {
                b[j]=nums[i];
                j+=1;
            }
        }
        return b;
    }
}