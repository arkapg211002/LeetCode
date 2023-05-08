// https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent

class Solution {
public boolean checkAlmostEquivalent(String word1, String word2) {
int[] ans = new int[26];
for(int i = 0;i<word1.length();i++)
{
ans[Integer.valueOf(word1.charAt(i)-'a')]++;
}
for(int i = 0;i<word2.length();i++)
{
ans[Integer.valueOf(word2.charAt(i)-'a')]--;
}
for(int i = 0;i<ans.length;i++)
{
if(Math.abs(ans[i])>3)
return false;
}
return true;
}
}