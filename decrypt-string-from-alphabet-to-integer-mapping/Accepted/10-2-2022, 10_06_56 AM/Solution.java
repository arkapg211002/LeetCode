// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping

class Solution {
    public String freqAlphabets(String s) {
        List<Character>l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')//if found remove the last two characters from the list
            {   //for characters from j to z
                l.remove(l.size()-1);
                l.remove(l.size()-1);
                String sub=s.substring(i-2,i);//take the two characters before #
                l.add((char)(Integer.valueOf(sub)+96));//convert them to Integer and then character
            }
            else if(s.charAt(i)=='0')l.add(' ');//before comingg across # 
            else l.add((char)(96+(int)s.charAt(i)-48));//for characters a to i            
        }
        String p="";
        for (Character c : l)p+=c;
        return p;
    }
}