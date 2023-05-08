// https://leetcode.com/problems/frog-position-after-t-seconds

class Solution {
    double prob;
    public double frogPosition(int n, int[][] edges, int t, int target) {
        ArrayList<ArrayList<Integer>>l=new ArrayList<>();
        for(int i=0;i<n;i++)l.add(new ArrayList<>());
        for(int r[]:edges)
        {
            l.get(r[0]-1).add(r[1]-1);
            l.get(r[1]-1).add(r[0]-1);
        }
        int v[]=new int[n];
        Arrays.fill(v,-1);
        dfs(0,v,l,t,target-1,1.0);
        return prob;
    }
    public void dfs(int node,int v[],ArrayList<ArrayList<Integer>>l,int t,int target,double p)
    {
        int len=0;
        if(node==0)len=l.get(node).size();
        else len=l.get(node).size()-1;
        v[node]=1;
        if(node==target)
        {
            if(t==0)prob=p;
            else if(t>0 && len==0)prob=p;
        }
        if(t>0)
        {
            for(Integer it:l.get(node))
            {
                if(v[it]==-1)
                    dfs(it,v,l,t-1,target,p/len);
            }
        }
    }

}