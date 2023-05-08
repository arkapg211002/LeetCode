// https://leetcode.com/problems/find-the-pivot-integer

class Solution {
    public int pivotInteger(int n) {
        int s=n*(n+1)/2;
        for(int i=1;i<=n;i++)
        {
            int d=i*(i+1)/2,e=s-d+i;
            if(d==e)return i;
        }
        return -1;
    }
}