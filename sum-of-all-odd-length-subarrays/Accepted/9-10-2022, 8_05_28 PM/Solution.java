// https://leetcode.com/problems/sum-of-all-odd-length-subarrays

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i]+arr[i-1];
            
        }
        int s=arr[arr.length-1];
        for(int i=3;i<=arr.length;i+=2)
        {
            for(int j=i-1;j<arr.length;j++)
            {
                if(j-i<0)s+=arr[j];
                else s+=arr[j]-arr[j-i];
            }
        }
        return s;
        
    }
}