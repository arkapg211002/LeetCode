// https://leetcode.com/problems/uncommon-words-from-two-sentences

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String a[]=s1.split(" ");
        String b[]=s2.split(" ");
        HashMap<String,Integer>h=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(h.containsKey(a[i])==false)h.put(a[i],1);
            else h.put(a[i],h.get(a[i])+1);
        }
        for(int i=0;i<b.length;i++)
        {
            if(h.containsKey(b[i])==false)h.put(b[i],1);
            else h.put(b[i],h.get(b[i])+1);
        }
        List<String>l=new ArrayList<>();
        for(Map.Entry<String,Integer>e:h.entrySet())
        {
            if(e.getValue()==1)l.add(e.getKey());
        }
        return l.toArray(new String[0]);
    }
}