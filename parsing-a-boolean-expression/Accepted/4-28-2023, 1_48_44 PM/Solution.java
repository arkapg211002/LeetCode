// https://leetcode.com/problems/parsing-a-boolean-expression


class Solution {
    public boolean parseBoolExpr(String expression) {
        Deque<Boolean> stack = new ArrayDeque<>(); // store the computational result
        Deque<Character> op = new ArrayDeque<>();  // store the pending operators
        Deque<Character> p  = new ArrayDeque<>();  // store the operator for the current level.
        for (char ch : expression.toCharArray()){
            switch(ch){
                case '!', '&', '|' -> p.push(ch); // enter a new level, update the current operator.
                case 'f', 't' -> stack.push(ch == 't'); // leaf node, push true or false directly into the stack
                case '(' -> {op.push(ch); if (p.peek() == '!') op.push('!');} // Add ! if the current lvl operator is !
                case ')' -> {go(op, stack); op.pop(); p.pop();} // process pending operators and pop off top items from op ['('] and p (lvl ended).
                default  -> {go(op, stack); op.push(p.peek());} // process pending operators and push current operator onto op.
            };
        }
        go(op, stack); // process remaining operators.
        return stack.pop(); // It is guaranteed that there will only be 1 element left on the stack - that's the answer.
    }

    private void go(Deque<Character> op, Deque<Boolean> stack){
        while(!op.isEmpty() && op.peek() != '('){
            switch(op.pop()){
                case '|' -> stack.push(stack.pop() | stack.pop());
                case '&' -> stack.push(stack.pop() & stack.pop());
                default  -> stack.push(!stack.pop());
            };
        }
    }
}