// https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros

 class Solution {
public boolean checkZeroOnes(String s) {
    int len1=0,len0=0;// for calculating the max length of 1& 0 respectively
    int i=0;
    while(i<s.length()){
         int temp=0;
        while(i<s.length()&&s.charAt(i)=='1')//count the 1s in substring
        {
            temp++;
            i++;
        }
        len1=Math.max(temp,len1);
        temp=0;
        while(i<s.length()&&s.charAt(i)=='0')//count the 0s in substring
        {
            temp++;
            i++;
        }
        len0=Math.max(temp,len0);
     }
    return len1>len0;
}
}