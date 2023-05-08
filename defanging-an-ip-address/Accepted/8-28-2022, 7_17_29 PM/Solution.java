// https://leetcode.com/problems/defanging-an-ip-address

class Solution {
    public String defangIPaddr(String address) {
        char ch='\u0000';String sb="";
        for(int i=0;i<address.length();i++)
        {
            ch=address.charAt(i);
            if(ch=='.')sb=sb+"[.]";
            else sb=sb+ch;
        }
        return sb;
    }
}