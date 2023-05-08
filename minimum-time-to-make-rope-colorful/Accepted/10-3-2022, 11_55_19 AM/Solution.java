// https://leetcode.com/problems/minimum-time-to-make-rope-colorful

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i=0;
        int ans=0;
        while(i<colors.length()) {
            long sum=0;
            int max=Integer.MIN_VALUE;
            while(i+1<colors.length() && colors.charAt(i+1)==colors.charAt(i)) {
                sum+=neededTime[i];
                max=Math.max(max, neededTime[i]);
                i++;
            }
            max=Math.max(max, neededTime[i]);
            sum+=neededTime[i];
            //debug 
            // System.out.println(max+" "+sum+"i="+i);
            sum-=max;
            ans+=sum;
            i++;
        }
        return ans;
    }
}