// https://leetcode.com/problems/maximum-repeating-substring

class Solution {
    public int maxRepeating(String sequence, String word) {
        int c=0;
        while(sequence.contains(word)==true)
        {
            c+=1;
            word=word+word;
        }
        return c;
    }
}