// https://leetcode.com/problems/smallest-string-with-a-given-numeric-value

class Solution {
    public String getSmallestString(int n, int k) {
    char c[]=new char[n];
    Arrays.fill(c,'a');
    int i=n-1;
    k-=n;
    while(k>0)
    {
        if(k>25)
        {
            c[i--]='z';
            k-=25;
        }
        else
        {
            c[i--]=(char)('a'+k);
            k=0;
        }
    }
    return String.valueOf(c);
}
}