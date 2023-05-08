// https://leetcode.com/problems/add-binary

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0)
        {
            int s=carry;
            if(i>=0)s+=a.charAt(i--)-'0';
            if(j>=0)s+=b.charAt(j--)-'0';
            
            sb.append(s%2);
            carry=(s>1)?1:0;
        }
        if(carry!=0)sb.append(carry);
        return sb.reverse().toString();
    }
}