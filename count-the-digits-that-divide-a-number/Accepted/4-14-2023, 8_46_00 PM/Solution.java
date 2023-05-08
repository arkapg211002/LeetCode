// https://leetcode.com/problems/count-the-digits-that-divide-a-number

class Solution {
    public int countDigits(int nums) {
        int c=0,n=nums;
        while(n>0)
        {
            if(nums%(n%10)==0)c+=1;
            n/=10;
        }
        return c;
        
    }
}