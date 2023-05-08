// https://leetcode.com/problems/crawler-log-folder

class Solution {
    public int minOperations(String[] logs) {
        int c=0;
        for(int i=0;i<logs.length;i++)
        {
            if(Character.isLetter(logs[i].charAt(0))==true)c+=1;
            else if(logs[i].equals("../")==true)c-=1;
            else continue;
        }
        if(c<=0)return 0;
        else return c;
    }
}