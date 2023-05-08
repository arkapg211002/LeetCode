// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length

class Solution
{
    public int maxVowels(String s,int k)
    {
        int n=s.length();
        int max=0;
        int c=0;
        for(int i=0;i<k;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                c+=1;
        }
        max=c;
        for(int i=k;i<n;i++)
        {
            char prev=s.charAt(i-k);
            char cur=s.charAt(i);
            if(prev=='a' || prev=='e' || prev=='i' || prev=='o' || prev=='u')
                c-=1;
            if(cur=='a' || cur=='e' || cur=='i' || cur=='o' || cur=='u')
                c+=1;
            max=(int)Math.max(c,max);
        }
        return max;
    }
}