// https://leetcode.com/problems/check-if-the-sentence-is-pangram

class Solution {
    public boolean checkIfPangram(String sentence) {
        int a[]=new int[26];
        for(int i=0;i<sentence.length();i++)
        {
            a[(int)sentence.charAt(i)-97]+=1;
        }
        
        Arrays.sort(a);
        if(a[0]==0)return false;
        else return true;
        
        
        
    }
}