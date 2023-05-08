// https://leetcode.com/problems/mean-of-array-after-removing-some-elements

class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=(int)Math.ceil(arr.length*0.05);
        int s=0,i,j;
        for(i=0,j=arr.length-n;i<n && j<arr.length;i++,j++)
        {
            s+=arr[i]+arr[j];
        }
        return (double)((Arrays.stream(arr).sum()-s)*1.0/(arr.length-(2*n)));
        
    }
}