// https://leetcode.com/problems/goat-latin

import java.util.*;
class Solution {
    public String toGoatLatin(String sentence) {
        StringTokenizer st=new StringTokenizer(sentence," ");
        StringBuilder sb=new StringBuilder();
        String a="a";
        while(st.hasMoreTokens()){
            String word=st.nextToken();
            if(!isVowel(word.charAt(0))){
                if(word.length()>1){
                    word=word.substring(1,word.length())+word.charAt(0);
                }
            }
            sb.append(word+"ma"+a+" ");
            a+="a";
        }
        return sb.toString().trim();
        
    }
    private boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||
           c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
}