// https://leetcode.com/problems/word-pattern

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String sub[]=s.split(" ");
        if(sub.length!=pattern.length())return false;
        HashMap<String,Character>hm=new HashMap<>();
        HashSet<Character>h=new HashSet<>();
        for(int i=0;i<sub.length;i++)
        {
            h.add(pattern.charAt(i));
            if(hm.containsKey(sub[i])==false)hm.put(sub[i],pattern.charAt(i));
            else if(hm.get(sub[i])!=pattern.charAt(i))return false;
            else continue;
            
        }
        if(h.size()==hm.size())return true;
        else return false;
    }
}