// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string

class Solution {
    public String removeDuplicates(String s) {
       
       Stack<Character> stack=new Stack();
        
        char[] str=s.toCharArray();
        for(char ch:str)
        {
            if(!stack.isEmpty() && ch==stack.peek())
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }
        String result=stack.toString().replace("[", "").replace("]", "").replace(",","").replace(" ","");
        
        return result;
    }
}