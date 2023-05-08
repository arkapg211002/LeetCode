// https://leetcode.com/problems/first-letter-to-appear-twice

class Solution {
public char repeatedCharacter(String s) {
HashSet hash = new HashSet<>();
for(int i = 0 ; i<s.length();i++)
{
if(hash.contains(s.charAt(i)))
return s.charAt(i);
hash.add(s.charAt(i));
}
return ' ';
}
}