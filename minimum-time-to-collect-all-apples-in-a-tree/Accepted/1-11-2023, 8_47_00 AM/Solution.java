// https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree

class Solution {
    static int ans=0;
    public boolean dfs(List<List<Integer>> graph,int src,List<Boolean> hasApple,boolean[] visited){

        boolean ch=false;
        visited[src]=true;
        for(int nbr:graph.get(src)){
            if(!visited[nbr]){
            boolean a=dfs(graph,nbr,hasApple,visited);
            if(a){
              ans+=2;
              ch=true;
            }
            }
        }
        if(ch || hasApple.get(src))
        return true;
        return false;
    }
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {

        List<List<Integer>> graph=new ArrayList<List<Integer>>();

        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
           graph.get(edges[i][0]).add(edges[i][1]);
           graph.get(edges[i][1]).add(edges[i][0]);
        }

        boolean[] visited=new boolean[n+1];
        ans=0;

        boolean a=dfs(graph,0,hasApple,visited);

        return ans;
    }
}