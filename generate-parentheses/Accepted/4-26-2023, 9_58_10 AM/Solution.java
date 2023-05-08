// https://leetcode.com/problems/generate-parentheses

class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String>ans=new ArrayList<>();
        valid(ans,"",n,n);
        return ans;
    }     
    public void valid(ArrayList<String>ans,String st,int open,int close)
    {
        if(open==0 && close==0)
        {
            ans.add(st);
            return;
        }
        if(open>0)valid(ans,st+'(',open-1,close);
        if(close>open)valid(ans,st+')',open,close-1);
    } 
}