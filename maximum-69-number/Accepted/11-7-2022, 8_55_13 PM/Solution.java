// https://leetcode.com/problems/maximum-69-number

class Solution {
    public int maximum69Number (int num) {
        int max=num;
      StringBuilder s=new StringBuilder(Integer.toString(num));
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='9')
            {
                s.setCharAt(i,'6');
                StringBuilder sb=new StringBuilder();
                sb=s;
                String a=sb.toString();
                int n=Integer.valueOf(a);
                if(n>=max)max=n;
                s.setCharAt(i,'9');
            }
            else
            {
                s.setCharAt(i,'9');
                StringBuilder sb=new StringBuilder();
                sb=s;
                String a=sb.toString();
                int n=Integer.valueOf(a);
                if(n>=max)max=n;
                s.setCharAt(i,'6');
            }
        }
       return max;
    }
}