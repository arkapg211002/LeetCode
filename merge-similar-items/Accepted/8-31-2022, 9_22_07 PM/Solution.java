// https://leetcode.com/problems/merge-similar-items

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<items1.length;i++)
        {
            m.put(items1[i][0],items1[i][1]);
        }
        for(int i=0;i<items2.length;i++)
        {
            if(m.containsKey(items2[i][0]))
            {
                m.put(items2[i][0],m.get(items2[i][0])+items2[i][1]);
            }
            else
            {
                m.put(items2[i][0],items2[i][1]);
            }
        }
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>lm;
        for(Map.Entry<Integer,Integer>e:m.entrySet())
        {
            lm=new ArrayList<>();
            lm.add(e.getKey());
            lm.add(e.getValue());
            l.add(lm);
        }
        l.sort((a,b)->a.get(0)-b.get(0));
        return l;
    }
}