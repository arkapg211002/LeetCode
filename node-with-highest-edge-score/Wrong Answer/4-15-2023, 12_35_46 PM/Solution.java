// https://leetcode.com/problems/node-with-highest-edge-score

class Solution {
    public int edgeScore(int[] edges) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<edges.length;i++)
        {
            if(h.containsKey(edges[i])==false)h.put(edges[i],i);
            else h.put(edges[i],h.get(edges[i])+i);
        }
        int max=Integer.MIN_VALUE,ind=0;
        for(Map.Entry<Integer,Integer>e:h.entrySet())
        {
            if(e.getValue()>max)
            {
                max=e.getValue();
                ind=e.getKey();
            }
        }
        return ind;
    }
}