// https://leetcode.com/problems/path-with-maximum-probability

class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        double g[][]=new double[n][n];
        for(double r[]:g)Arrays.fill(r,1.00000);
        for(int i=0;i<edges.length;i++)
        {
            g[edges[i][0]][edges[i][1]]=succProb[i];
            g[edges[i][1]][edges[i][0]]=succProb[i];
        }
        double dist[]=new double[n];
        boolean spt[]=new boolean[n];
        Arrays.fill(dist,0.00000);
        dist[start]=1.00000;
        for(int i=0;i<n-1;i++)
        {
            int u=min(dist,spt,n);
            if(u==-1)continue;
            spt[u]=true;
            for(int v=0;v<n;v++)
            {
                if(!spt[v] && g[u][v]!=1.00000 && dist[u]!=0.00000 && dist[u]*g[u][v]>dist[v])
                    dist[v]=dist[u]*g[u][v];
            }
        }
        if(dist[end]<=0.00000)return 0.00000;
        else return dist[end];
    }
    public int min(double dist[],boolean spt[],int n)
    {
        int minindex=-1;
        double max=0.00000;
        for(int i=0;i<n;i++)
        {
            if(!spt[i] && dist[i]>=max)
            {
                max=dist[i];
                minindex=i;
            }
        }
        return minindex;
    }
}