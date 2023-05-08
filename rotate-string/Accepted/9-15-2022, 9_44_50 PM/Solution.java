// https://leetcode.com/problems/rotate-string

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        if(s.equals(goal)==true)return true;
        int id=0;
        for(int i=1;i<goal.length();i++)
        {
            if(s.contains(goal.substring(0,i))==false)
            {
                id=i-1;
                break;
            }
        }
        String sub=goal.substring(id,goal.length());
        if(s.substring(0,sub.length()).equals(sub)==true)return true;
        else return false;
        
    }
}