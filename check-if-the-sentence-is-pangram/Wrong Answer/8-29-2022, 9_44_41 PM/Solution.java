// https://leetcode.com/problems/check-if-the-sentence-is-pangram

class Solution {
    public boolean checkIfPangram(String sentence) {
        int a[]=new int[26];
        for(int i=0;i<sentence.length();i++)
        {
            a[(int)sentence.charAt(i)-97]+=1;
        }
        String s=Arrays.toString(a);
        if(s.indexOf('0')==-1)return true;
        else return false;
    }
}