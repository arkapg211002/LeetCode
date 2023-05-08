// https://leetcode.com/problems/counting-words-with-a-given-prefix

class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        
        for(String word: words){ 
            //if the given prefix appears in the beginning
            //increment the count
            if(word.indexOf(pref) == 0){
                count++;
            }
        }
        
        return count;
    }
}