// https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence

class Solution {
    public boolean areNumbersAscending(String s) {
        String str[]=s.split(" ");
        int c=Integer.MIN_VALUE;
        for(int i=0;i<str.length;i++)
        {
            //System.out.println(str[i]);
            if(str[i].matches("[-+]?\\d*\\.?\\d+"))
            {
                //System.out.println(str[i]);
                if(Integer.valueOf(str[i])<=c)return false;
                else c=Integer.valueOf(str[i]);
            }
        }
        return true;
    }
}