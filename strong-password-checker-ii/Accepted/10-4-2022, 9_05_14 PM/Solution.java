// https://leetcode.com/problems/strong-password-checker-ii

class Solution {
    public boolean strongPasswordCheckerII(String password) 
    {
        if(password.length() < 8)
            return false;
        
        boolean lowercase = false,uppercase = false,digit = false,special = false,adj = true;
        
        char c = password.charAt(0);
            
            if(Character.isLowerCase(c))
                lowercase = true;
            
            if(Character.isUpperCase(c))
                uppercase = true;
            
            if(c > 47 && c < 58)
                digit = true;
            
            if(c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '*' || c == '(' || c == ')' || c == '-' || c == '+')
                special = true;
        
        for(int i=1; i<password.length();i++)
        {
            char ch = password.charAt(i);
            
            if(Character.isLowerCase(ch))
                lowercase = true;
            
            if(Character.isUpperCase(ch))
                uppercase = true;
            
            if(ch > 47 && ch < 58)
                digit = true;
            
            if(ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+')
                special = true;
            
            if(password.charAt(i-1) == ch)
                adj = false;
        }
        return (lowercase & uppercase & digit & special & adj);
    }
}