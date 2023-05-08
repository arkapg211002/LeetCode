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
        if(hm.size()==1)return s.length();
        int c=0,max=Integer.MIN_VALUE;
        for(Map.Entry<Character,Integer>e:hm.entrySet())
        {
            if(e.getValue()%2==0)c+=e.getValue();
            else if(e.getValue()%2!=0 && e.getValue()>max)max=e.getValue();            
        }
        c+=max;
        for(Map.Entry<Character,Integer>e:hm.entrySet())
        {
            if(e.getValue()%2!=0 && e.getValue()!=max)c+=e.getValue()-1;            
        }
        return c;
    }
}