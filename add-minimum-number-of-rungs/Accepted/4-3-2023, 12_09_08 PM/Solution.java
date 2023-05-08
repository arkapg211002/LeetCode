// https://leetcode.com/problems/add-minimum-number-of-rungs

class Solution {
    public int addRungs(int[] rungs, int dist) {
        int cur =0;
        int res =0;
        for(int n:rungs){
            if(n-cur>dist){
                int q = (n-cur-1)/dist;
            
                res += q;
            
            }
            cur = n;
        }
        return res;
    }
}