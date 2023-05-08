// https://leetcode.com/problems/number-of-good-ways-to-split-a-string

class Solution {
    public int numSplits(String s) {
        HashMap<Character, Integer> left = new HashMap<>(); 
        HashMap<Character, Integer> right = new HashMap<>(); 
        for(int i = 0; i < s.length(); i++)
            right.put(s.charAt(i), right.getOrDefault(s.charAt(i), 0) + 1); 
        int count = 0; 
        for(int i = 0; i < s.length(); i++)
        {
            char curr = s.charAt(i); 
            left.put(curr, left.getOrDefault(curr, 0) + 1); 
            right.put(curr, right.getOrDefault(curr, 0) - 1);  
            if(right.get(curr) <= 0)right.remove(curr); 
            if(left.size() == right.size())count++; 
        }
        return count;   
    }
}