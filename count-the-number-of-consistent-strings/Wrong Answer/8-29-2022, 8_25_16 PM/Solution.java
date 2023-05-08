// https://leetcode.com/problems/count-the-number-of-consistent-strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        String p="";
        for(int i=0;i<words.length;i++)
        {
            HashSet<Character>h=new HashSet<>();
            for(int j=0;j<words[i].length();j++)
            {
                h.add(words[i].charAt(j));
            }
            ArrayList<Character>c=new ArrayList<>();
            for(Character ch:h)
            {
                c.add(ch);
            }
            Collections.sort(c);
            for(Character cha:c)
            {
                p+=cha;
            }
            words[i]=p;
            p="";
        }
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            if(allowed.equals(words[i])==true)count+=1;
        }
        return count;
        
    }
}