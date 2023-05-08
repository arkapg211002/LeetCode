// https://leetcode.com/problems/network-delay-time

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int g[][]=new int[n][n];
        for(int i=0;i<times.length;i++)
        {
            g[times[i][0]-1][times[i][1]-1]=times[i][2];
        }
        int min=dj(g,k-1,n);
        if(min>=Integer.MAX_VALUE)return -1;
        else return min;
    }
    public int min(int dist[],int spt[])
    {
        int minindex=-1,min=Integer.MAX_VALUE;
        for(int i=0;i<dist.length;i++)
        {
            if(spt[i]==-1 && dist[i]<min)
            {
                min=dist[i];
                minindex=i;
            }
        }
        return minindex;
    }
    public int dj(int g[][],int src,int n)
    {
        int dist[]=new int[n];
        int spt[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        Arrays.fill(spt,-1);
        dist[src]=0;
        for(int count=0;count<n-1;count++)
        {
            int u=min(dist,spt);
            spt[u]=1;
            for(int v=0;v<n;v++)
            {
                if(spt[v]==-1 && g[u][v]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+g[u][v]<dist[v]){
                dist[v]=dist[u]+g[u][v];
                //spt[v]=1;
                }
            }
        }
        /*for(int i=0;i<n;i++)
            System.out.println(i+" "+dist[i]+" "+spt[i]);

        if(Arrays.stream(spt).sum()!=n || Arrays.stream(spt).sum()!=n-2)return -1;
        else
        {
            Arrays.sort(dist);
            return dist[dist.length-1];
        }*/
        Arrays.sort(dist);
        return dist[dist.length-1];
    }
}