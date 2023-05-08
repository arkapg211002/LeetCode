// https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts

class Solution {
    public String generateTheString(int n) {
        String a[];
        if(n%2==0)
        {
            a=new String[n-1];
            Arrays.fill(a,"a");
            return (String.join("",a)+"b");
        }
        else 
        {
            a=new String[n];
            Arrays.fill(a,"a");
            return String.join("",a);
        }
        
    }
}