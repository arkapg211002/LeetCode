// https://leetcode.com/problems/count-common-words-with-one-occurrence

class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        
        for (String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        for (String word : words2) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }
        
        int count = 0;
        for (String word : words1) {
            if (map.get(word) == 1 && map1.getOrDefault(word, 0) == 1) {
                count++;
            }
        } 
        return count;   
    }
}