// https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique

class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer>h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(h.containsKey(s.charAt(i))==false)h.put(s.charAt(i),1);
            else h.put(s.charAt(i),h.get(s.charAt(i))+1);
        }
        int a[]=new int[h.size()];
        int k=0;
        for(Map.Entry<Character,Integer>e:h.entrySet())
        {
            a[k]=e.getValue();
            k+=1;
        }
        Arrays.sort(a);
        int s1=Arrays.stream(a).sum();
        /*for(int i=1;i<a.length-1;i++)
            while(a[i]==a[i-1] || a[i]==a[i+1])a[i]-=1;
        */
        for(int i=a.length-2;i>=0;i--)
        {
            while(a[i]>=a[i+1])a[i]-=1;
        }
        int s2=Arrays.stream(a).sum();
        return (s1-s2);
    }
}