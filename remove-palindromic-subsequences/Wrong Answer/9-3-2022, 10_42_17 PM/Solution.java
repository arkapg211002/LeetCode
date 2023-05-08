// https://leetcode.com/problems/remove-palindromic-subsequences

class Solution {
    public int removePalindromeSub(String s) {
        /*int n=s.length();
        //StringBuilder sb=new StringBuilder(s);
        int l=s.length(),c=0;
        while(n!=0)
        {
            
            if(s.equals(new StringBuilder(s.substring(0,l)).reverse().toString())==true)
            {
                c+=1;
                s=s.substring(l);
                l=s.length();
            }
            else l-=1;
        }
        return c;*/
        int l=s.length();
        int c=0;
        while(s.length()!=0)
        {
            String sub=s.substring(0,l);
            if(sub.equals(new StringBuilder(sub).reverse().toString())==true)
            {
                c+=1;
                s=s.substring(l);
                l=s.length();
            }
            else l-=1;
        }
        return c;
    }
}