// https://leetcode.com/problems/find-the-most-competitive-subsequence

class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> s=new Stack<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty()  && nums[i] < s.peek() && (n-i)>(k-s.size()))
                s.pop();
            if(s.size()<k)
            s.push(nums[i]);
        }
        int a[]=new int[k];
        for(int i=k-1;i>=0;i--)
            a[i]=s.pop();
         return a;
    }
   
}