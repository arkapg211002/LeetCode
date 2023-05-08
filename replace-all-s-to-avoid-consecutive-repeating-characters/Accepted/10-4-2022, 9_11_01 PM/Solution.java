// https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters

class Solution {
    public String modifyString(String s) {
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='?')
                for(char j='a';j<='c';j++){ // j = (a-z) is not required.
                    if(i>0 && ch[i-1]==j) continue; // skip if previous character is one of a,b,c
                    if(i<s.length()-1 && ch[i+1]==j) continue; //skip if next character is one of a,b,c
                    ch[i] = j; //set with the current character from a,b,c
                    break;
                }
        }
        return String.valueOf(ch);
    }
}