// https://leetcode.com/problems/node-with-highest-edge-score

class Solution {
    public int edgeScore(int[] edges) {
        HashMap<Integer,Long>h=new HashMap<>();
        for(int i=0;i<edges.length;i++)
        {
            if(h.containsKey(edges[i])==false)h.put(edges[i],(long)i);
            else h.put(edges[i],h.get(edges[i])+(long)i);
        }
        long max=Long.MIN_VALUE;
        System.out.println(h);
        for(Map.Entry<Integer,Long>e:h.entrySet())
            max=(long)Math.max(max,e.getValue());

        List<Integer>l=new ArrayList<>();
        for(Map.Entry<Integer,Long>e:h.entrySet())
        {
            if(e.getValue()==max)l.add(e.getKey());
        }
        Collections.sort(l);
        return l.get(0);
    }
}