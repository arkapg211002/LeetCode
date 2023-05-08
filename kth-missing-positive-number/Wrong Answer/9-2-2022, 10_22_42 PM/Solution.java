// https://leetcode.com/problems/kth-missing-positive-number

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int a[]=new int[1000];
        for(int i=0;i<arr.length;i++)
        {
            a[arr[i]]=1;
        }
        int j=1;
        int n=0;
        while(j<=k)
        {
            if(a[n]==1)
            {
                n+=1;
                continue;
            }
            j+=1;
            n+=1;
        }
        return n;
        
    }
}