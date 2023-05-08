// https://leetcode.com/problems/find-the-k-beauty-of-a-number

class Solution {
    public int divisorSubstrings(int num, int k) {
        int n=num,i=k,c=0;
        String s=Integer.toString(num);
        while(i<=s.length())
        {
            String sub=s.substring(i-k,i);
            int subn=Integer.parseInt(sub);
            if(subn!=0 && n%subn==0)c+=1;
            i+=1;
            
        }
        return c;
    }
}