// https://leetcode.com/problems/rearrange-characters-to-make-target-string

class Solution {
public int rearrangeCharacters(String s, String target) {
int[] target_count = new int[26];
int[] s_count = new int[26];
for(int i = 0;i<target.length();i++)
{
target_count[target.charAt(i) - 'a']++;
}
for(int i = 0;i<s.length();i++)
{
s_count[s.charAt(i) - 'a']++;
}
int min = Integer.MAX_VALUE;
for(int i = 0;i<26;i++)
{
if(target_count[i] > 0)
{
min = Math.min(min , s_count[i]/target_count[i]);
}
}
return min;
}
}