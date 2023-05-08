// https://leetcode.com/problems/validate-stack-sequences

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int p1 = 0;
        int p2 = 0;
        while (p2 < popped.length) 
        {
            if (!stack.empty() && stack.peek() == popped[p2]) 
            {
                stack.pop();
                p2++;
            } 
            else 
            {
                if (p1 < pushed.length) 
                {     
                    stack.push(pushed[p1]);
                    p1++;
                } 
                else return false;
            }
        }
        return true;
    }
}