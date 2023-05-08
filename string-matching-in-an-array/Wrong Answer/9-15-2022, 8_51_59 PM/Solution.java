// https://leetcode.com/problems/string-matching-in-an-array

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String>l=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(words[j].equals(words[i])==false && words[j].contains(words[i]))l.add(words[i]);
            }
        }
        return l;
    }
}