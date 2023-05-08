// https://leetcode.com/problems/find-center-of-star-graph

class Solution {
    public int findCenter(int[][] edges) {
        int max=0;
        for(int i=0;i<edges.length;i++)
        {
            max=(int)Math.max(max,Math.max(edges[i][0],edges[i][1]));
        }
        ArrayList<ArrayList<Integer>>l=new ArrayList<>();
        for(int i=0;i<max;i++)l.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++)
        {
            l.get(edges[i][0]-1).add(edges[i][1]-1);
            l.get(edges[i][1]-1).add(edges[i][0]-1);
        }
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i).size()==max-1)
                return i+1;
        }
        return 1;
    }
}