// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters

class Solution {
    public int countCharacters(String[] words, String chars) {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            if(word(words[i],chars)==1)c+=words[i].length();
        }
        return c;
    }
    public int word(String w,String c)
    {
        HashSet<Character>h=new HashSet<>();
        for(int i=0;i<w.length();i++)
        {
            h.add(w.charAt(i));
        }
        for(char s:h)
        {
            if(c.contains(Character.toString(s))==false)return 0;
        }
        return 1;
    }
}