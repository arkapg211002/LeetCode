// https://leetcode.com/problems/largest-substring-between-two-equal-characters

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        int res=-1;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(hmap.containsKey(ch))
                res=Math.max(res,i-1-hmap.get(ch));
            else
                hmap.put(ch,i);
        }
        return res;
    }
}