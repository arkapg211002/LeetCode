// https://leetcode.com/problems/check-if-word-equals-summation-of-two-words

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return (sum(firstWord)+sum(secondWord)==sum(targetWord))?true:false;
    }
    public int sum(String s){
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum=sum*10+(int)s.charAt(i)-97;
        }
        return sum;
    }
}