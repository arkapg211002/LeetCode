// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping

class Solution {
    public String freqAlphabets(String s) {
        List<Character>l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
                l.remove(l.size()-1);
                l.remove(l.size()-1);
                String sub=s.substring(i-2,i);
                l.add((char)(Integer.valueOf(sub)+96));
            }
            else if(s.charAt(i)=='0')l.add(' ');
            else 
            {
                l.add((char)(96+(int)s.charAt(i)-48));
            }
        }
        String p="";
        for (Character c : l)
        {
            p+=c;
        }
        return p;
    }
}