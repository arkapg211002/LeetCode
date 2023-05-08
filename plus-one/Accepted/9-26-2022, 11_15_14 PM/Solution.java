// https://leetcode.com/problems/plus-one

class Solution {
    public int[] plusOne(int[] digits) {
        int c=1;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]+c>9)
            {
               
                int n=(digits[i]+c)%10;        
                c=(digits[i]+c)/10;
                digits[i]=n;
            }
            else
            {
                
                digits[i]=(digits[i]+c)%10;  
                c=0;
            }
        }
        //System.out.println(c);
        if(c>0)
        {
            int ans[]=new int[digits.length+1];
            ans[0]=c;
            for(int i=0;i<digits.length;i++)
            {
                ans[i+1]=digits[i];
            }
            return ans;
        }
        else return digits;
    }
}