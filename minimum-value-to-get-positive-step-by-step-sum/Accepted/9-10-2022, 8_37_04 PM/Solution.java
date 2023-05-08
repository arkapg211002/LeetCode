// https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum

class Solution {
    public int minStartValue(int[] nums) {
        int k=1;
        int arr[]=new int[nums.length];
        while(k>0)
        {
            for(int i=0;i<nums.length;i++)
            {
                arr[i]=nums[i];
            }
            if(pre(arr,k)==1)
            {
                break;
            }
            k++;
            
        }
        return k;
    }
    public int pre(int a[],int k)
    {
        a[0]+=k;
        if(a[0]<1)return 0;
        for(int i=1;i<a.length;i++)
        {
            a[i]=a[i]+a[i-1];
            if(a[i]<1)return 0;
        }
        return 1;
    }
}