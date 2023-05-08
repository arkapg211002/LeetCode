// https://leetcode.com/problems/node-with-highest-edge-score

class Solution {
    public int edgeScore(int[] edges) {
        HashMap<Integer,Long>h=new HashMap<>();
        for(int i=0;i<edges.length;i++)
        {
            if(h.containsKey(edges[i])==false)h.put(edges[i],(long)i);
            else h.put(edges[i],h.get(edges[i])+(long)i);
        }
        long max=Long.MIN_VALUE;int ind=0;
        System.out.println(h);
        for(Map.Entry<Integer,Long>e:h.entrySet())
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