// https://leetcode.com/problems/maximum-score-from-removing-stones

class Solution {
    public int maximumScore(int a, int b, int c) {
        int s[]=new int[3];
        s[0]=a;
        s[1]=b;
        s[2]=c;
        Arrays.sort(s);
        if(s[1]==s[2])return s[2];
        else if(s[2]-s[1]>=s[0])return s[0]+s[1];
        else return (a+b+c)/2;
        
    }
}