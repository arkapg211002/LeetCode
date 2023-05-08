// https://leetcode.com/problems/make-the-string-great

class Solution {
    public String makeGood(String s) {
        
      Stack<Character> stack=new Stack<>();
      for(int i=0;i<s.length();i++){
        if(!stack.isEmpty() 
           && 
           (
             (Character.isUpperCase(stack.peek()) && Character.isLowerCase(s.charAt(i)) && Character.toLowerCase(stack.peek())==s.charAt(i))
            ||
             (Character.isUpperCase(s.charAt(i)) && Character.isLowerCase(stack.peek()) && Character.toUpperCase(stack.peek())==s.charAt(i))
           )
          )
          stack.pop();
        else
          stack.push(s.charAt(i));
      }
      StringBuilder sb=new StringBuilder();
      
      while(!stack.isEmpty())
        sb.append(stack.pop());
      
      return sb.reverse().toString();
    }
}