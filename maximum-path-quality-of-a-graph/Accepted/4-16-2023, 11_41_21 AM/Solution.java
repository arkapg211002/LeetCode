// https://leetcode.com/problems/maximum-path-quality-of-a-graph

class Solution {
    int ans;
    public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        int n=values.length;
        int v[]=new int[n];
        ArrayList<ArrayList<int[]>>l=new ArrayList<>();
        for(int i=0;i<n;i++)l.add(new ArrayList<>());
        for(int r[]:edges)
        {
            l.get(r[0]).add(new int[]{r[1],r[2]});
            l.get(r[1]).add(new int[]{r[0],r[2]});
        }
        dfs(0,l,v,values,maxTime,0,0);
        return ans;
    }
    public void dfs(int node,ArrayList<ArrayList<int[]>>l,int v[],int values[],int maxTime,int curTime,int res)
    {
        if(curTime>maxTime)return;
        if(v[node]==0)res+=values[node];
        if(node==0)ans=(int)Math.max(ans,res);
        v[node]+=1;
        for(int it[]:l.get(node))
            dfs(it[0],l,v,values,maxTime,curTime+it[1],res);
        v[node]-=1;
    }
}