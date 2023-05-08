// https://leetcode.com/problems/find-the-distance-value-between-two-arrays

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int i=0;i<arr1.length;i++)
        {   
            int flag=1;
            for(int j=0;j<arr2.length;j++)
            {
                if((int)Math.abs(arr1[i]-arr2[j])<=d)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)c+=1;
        }
        return c;
    }
}