// https://leetcode.com/problems/course-schedule-ii

class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
        int n=numCourses;
        if(pre.length==0)
        {
            int res[]=new int[n];
            for(int i=0;i<n;i++)res[i]=i;
            return res;
        }
        ArrayList<ArrayList<Integer>>l=new ArrayList<>();
        List<Integer>d=new ArrayList<>();
        for(int i=0;i<n;i++)l.add(new ArrayList<>());
        for(int r[]:pre)
            l.get(r[1]).add(r[0]);
        if(isCyclic(n,l)==true)
        {
            return new int[0];
        }
        for(int i=0;i<n;i++)
        {
            d=new ArrayList<>();
            int v[]=new int[n];
            int p[]=new int[n];
            bfs(i,l,v,d);
            System.out.println(d);
            if(d.size()==n)break;
        }
        if(d.size()!=n)return new int[0];
        else
        {
            int ans[]=new int[n];
            for(int i=0;i<n;i++)
                ans[i]=d.get(i);
            return ans;
        }
    }
    public void bfs(int node,ArrayList<ArrayList<Integer>>l,int v[],List<Integer>d)
    {
        Queue<Integer>q=new LinkedList<>();
        q.add(node);
        v[node]=1;
        while(!q.isEmpty())
        {
            int nd=q.poll();
            d.add(nd);
            for(Integer it:l.get(nd))
            {
                if(v[it]==0)
                {
                    q.add(it);
                    v[it]=1;
                }
            }
        }
    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[V];
        int pathVis[] = new int[V];
        
        for(int i = 0;i<V;i++) {
            if(vis[i] == 0) {
                if(dfs(i, adj, vis, pathVis) == true) return true; 
            }
        }
        return false; 
    }
    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int vis[], int pathVis[]) {
        vis[node] = 1; 
        pathVis[node] = 1; 
        
        // traverse for adjacent nodes 
        for(int it : adj.get(node)) {
            // when the node is not visited 
            if(vis[it] == 0) {
                if(dfs(it, adj, vis, pathVis) == true) 
                    return true; 
            }
            // if the node has been previously visited
            // but it has to be visited on the same path 
            else if(pathVis[it] == 1) {
                return true; 
            }
        }
        
        pathVis[node] = 0; 
        return false; 
    }
}