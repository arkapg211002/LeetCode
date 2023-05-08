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
        //System.out.println(hm);
        if(hm.size()==1)return s.length();
        int c=0,max=0;char ch='\u0000';
        for(Map.Entry<Character,Integer>e:hm.entrySet())
        {
            if(e.getValue()%2==0)c+=e.getValue();
            else if(e.getValue()%2!=0 && e.getValue()>max)
            {
                max=e.getValue();       
                ch=e.getKey();
            }
        }
        //System.out.println(max);
        c+=max;
        for(Map.Entry<Character,Integer>e:hm.entrySet())
        {
            if(e.getValue()%2!=0 && e.getKey()!=ch)c+=e.getValue()-1;            
        }
        return c;
    }
}