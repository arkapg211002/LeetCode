// https://leetcode.com/problems/network-delay-time

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int g[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)g[i][j]=Integer.MIN_VALUE;
        }
        for(int i=0;i<times.length;i++)
            g[times[i][0]-1][times[i][1]-1]=times[i][2];
        int dist[]=new int[n];
        boolean spt[]=new boolean[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k-1]=0;
        for(int i=0;i<n;i++)
        {
            int u=min(dist,spt);
            if(u==-1)continue;
            spt[u]=true;
            for(int v=0;v<n;v++)
            {
                if(g[u][v]!=Integer.MIN_VALUE)
                {
                    int nd=dist[u]+g[u][v];
                    if(nd<dist[v])dist[v]=nd;
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<dist.length;i++)
        {
            if(dist[i]==Integer.MAX_VALUE)return -1;
            max=(int)Math.max(max,dist[i]);
        }
        return max;
    }
    public int min(int dist[],boolean spt[])
    {
        int minindex=-1,min=Integer.MAX_VALUE;
        for(int i=0;i<dist.length;i++)
        {
            if(!spt[i] && dist[i]<min)
            {
                min=dist[i];
                minindex=i;
            }
        }
        return minindex;
    }
}