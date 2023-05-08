// https://leetcode.com/problems/count-vowel-substrings-of-a-string

class Solution {
    public int countVowelSubstrings(String word) {
        int c=0;
        for(int i=0;i<word.length();i++)
        {
            HashSet<Character>h=new HashSet<>();
            for(int j=i;j<word.length();j++)
            {
                char ch=word.charAt(j);
                //System.out.println(ch);
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')break;
                else h.add(word.charAt(j));
                //System.out.println(h);
                if(h.size()==5)c++;
            }
        }
        return c;
    }
}