// https://leetcode.com/problems/remove-digit-from-number-to-maximize-result

class Solution {
    public String removeDigit(String number, char digit) {
        if(number.length()==1)return number;
        else if(number.indexOf(digit)==0)return number.substring(1);
        else if(number.indexOf(digit)==number.length()-1)return number.substring(0,number.length()-1);
        int max=Integer.MIN_VALUE;     
        for(int i=0;i<number.length();i++)
        {
            if(number.charAt(i)==digit)
            {
                String s=number.substring(0,i)+number.substring(i+1,number.length());
                int num=Integer.parseInt(s);
                if(num>max)max=num;
            }
        }
        return Integer.toString(max);
    }
}