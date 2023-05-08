// https://leetcode.com/problems/find-if-path-exists-in-graph

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>>l=new ArrayList<>();
        int max=0;
        for(int i=0;i<edges.length;i++)
            max=(int)Math.max(max,Math.max(edges[i][0],edges[i][1]));
        for(int i=0;i<max+1;i++)
            l.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++)
        {
            l.get(edges[i][0]).add(edges[i][1]);
            l.get(edges[i][1]).add(edges[i][0]);
        }
        int v[]=new int[max+1];
        dfs(source,v,l);
        if(v[source]==1 && v[destination]==1)return true;
        else return false;
    }
    public void dfs(int node,int v[],ArrayList<ArrayList<Integer>>l)
    {
        v[node]=1;
        for(Integer it:l.get(node))
            if(v[it]==0)dfs(it,v,l);
    }
}