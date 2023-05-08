// https://leetcode.com/problems/valid-palindrome-ii

class Solution {

public boolean isPal(String s){
    int i = 0, j = s.length() - 1;
    
    while(i < j){
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    
    return true;
}
public boolean validPalindrome(String s) {
    int i = 0, j = s.length() - 1;
    int count = 0;
    
    while(i<j){
        if(s.charAt(i) != s.charAt(j)){
            
            String s1,s2;
            
            
            s1=s.substring(0,i)+s.substring(i+1,s.length());
            s2=s.substring(0,j)+s.substring(j+1,s.length());
            
            if(isPal(s1) || isPal(s2))
                return true;
            
            else return false;                
            
        }
        else{
            i++;
            j--;
        }
    }
    
    return true;
}
}