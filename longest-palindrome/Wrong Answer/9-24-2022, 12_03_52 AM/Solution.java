// https://leetcode.com/problems/longest-palindrome

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i))==false)
            {
                hm.put(s.charAt(i),1);
            }
            else
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        int c=0,flag=0;
        for(Map.Entry<Character,Integer>e:hm.entrySet())
        {
            if(e.getValue()%2==0)c+=e.getValue();
            else if(e.getValue()==1)flag=1;
            else c+=e.getValue()-1;
        }
        if(flag==1)return c+1;
        else return c;
    }
}