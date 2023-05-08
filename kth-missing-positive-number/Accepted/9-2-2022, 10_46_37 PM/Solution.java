// https://leetcode.com/problems/kth-missing-positive-number

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int c=0,i=0;
        while(k>0)
        {
            c+=1;
            if(i<arr.length && arr[i]==c)
            {
                i+=1;
                continue;
            }
            k-=1;
        }
        return c;
        
    }
}