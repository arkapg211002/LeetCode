// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> st = new Stack<>();
       
        for(char c : chars){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    char ch = st.peek();
                    if(c==')' && ch=='(' || c==']' && ch=='[' || c=='}' && ch=='{'){
                        st.pop();
                    }else{
                        return false;
                    }        
                }
            }
        }
        return st.isEmpty();
    }
}