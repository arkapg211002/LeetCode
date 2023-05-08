// https://leetcode.com/problems/check-distances-between-same-letters

class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i))==false) hm.put(s.charAt(i),i);
            else hm.put(s.charAt(i),i-hm.get(s.charAt(i))-1);
        }
        for(Map.Entry<Character,Integer>e:hm.entrySet())
            if(distance[(int)e.getKey()-97]!=e.getValue())return false;
        return true;
    }
}