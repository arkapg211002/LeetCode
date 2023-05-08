// https://leetcode.com/problems/partition-labels

class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>l=new ArrayList<>();
        HashMap<Character,Integer>h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            h.put(s.charAt(i),i);
        }
        int ind=h.get(s.charAt(0)),p=0,d=0;
        for(int i=0;i<s.length();i++)
        {
            if(i>ind)
            {
                //System.out.println(ind);
                l.add(ind+1-p);
                p=ind+1;
            }
            d=h.get(s.charAt(i));
            ind=(int)Math.max(d,ind);            
        }
        l.add(s.length()-p);
        return l;
    }
}