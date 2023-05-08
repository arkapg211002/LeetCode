// https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case

class Solution {
    public String greatestLetter(String s) {
        HashSet<String>h=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            String ch=Character.toString(s.charAt(i));
            if(s.contains(ch.toUpperCase())==true && s.contains(ch.toLowerCase())==true)h.add(ch.toUpperCase());
        }
        List<String>l=new ArrayList<>(h);
        Collections.sort(l);
        if(l.size()==0)return "";
        return l.get(l.size()-1);
        
    }
}