// https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters

class Solution {
public int countGoodSubstrings(String s) {
int ans = 0;
for(int i = 0;i<s.length()-2;i++)
{
if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i)!=s.charAt(i+2))
ans++;
}
return ans;
}
}