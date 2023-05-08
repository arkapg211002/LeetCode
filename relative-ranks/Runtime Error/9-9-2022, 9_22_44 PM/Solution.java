// https://leetcode.com/problems/relative-ranks

class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<Integer>l=new ArrayList<>();
        HashMap<Integer,String>h=new HashMap<Integer,String>();
        for(int i=0;i<score.length;i++)
        {
            l.add(score[i]);
        }
        Collections.sort(l);
        int len=l.size();
        h.put(l.get(len-1),"Gold Medal");
        h.put(l.get(len-2),"Silver Medal");
        h.put(l.get(len-3),"Bronze Medal");
        for(int i=l.size()-4;i>=0;i--)
        {
            h.put(l.get(i),Integer.toString(len-i));
        }
        //System.out.println(h);
        String str[]=new String[score.length];
        for(int i=0;i<score.length;i++)
        {
            str[i]=h.get(score[i]);
        }
        return str;
    }
}