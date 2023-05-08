// https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times

class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        if(arr.length==m && m==k)return true;
        int c=0;
        for(int i=0;i+m<arr.length;i++)
        {
            if(arr[i]==arr[i+m])c+=1;
            else c=0;
            if(c==m*(k-1))return true;
        }
        return false;
    }
}