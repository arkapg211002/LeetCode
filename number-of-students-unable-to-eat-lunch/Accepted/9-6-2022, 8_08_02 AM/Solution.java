// https://leetcode.com/problems/number-of-students-unable-to-eat-lunch

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
         Stack<Integer> st= new Stack<>();
    Queue<Integer> q = new ArrayDeque<>();
    for(int val : students){
        q.add(val);
    }
    
    for(int i = sandwiches.length-1;i>=0;i--){
        st.push(sandwiches[i]);
    }
    
    while(q.size()>0){
        if(q.peek()==st.peek()){
            q.remove();
            st.pop();
        }else{
            int cnt =0;
            int cs = q.size();
            while(q.peek()!=st.peek()){
                cnt++;
                int v = q.remove();
                q.add(v);
                if(cnt==cs){
                    return cs;
                }
            }
            
        }
    }
    return q.size();
}    
    
}