// https://leetcode.com/problems/number-of-segments-in-a-string

class Solution {
    public int countSegments(String s) {
        if(s.length()==0)return 0;
        String st[]=s.split(" ");
        int c=0;
        for(int i=0;i<st.length;i++)
        {
            if(st[i]!="")c+=1;
        }
        return c;
    }
}