// https://leetcode.com/problems/min-cost-to-connect-all-points

class Node{
    int u,v,w;
    Node(int _u,int _v,int _w)
    {
        this.u=_u;
        this.v=_v;
        this.w=_w;
    }
    Node(){}
    int getU(){return u;}
    int getV(){return v;}
    int getW(){return w;}
}
class sortc implements Comparator<Node>
{
    @Override
    public int compare(Node a,Node b)
    {
        if(a.getW()<b.getW())return -1;
        else if(a.getW()>b.getW())return 1;
        else return 0;
    }
}
class Solution {
    public int up(int u,int p[])
    {
        if(u==p[u])return u;
        int ulp=up(p[u],p);
        return p[u]=ulp;
    }
    public void union(int u,int v,int p[],int r[])
    {
        int ulp=p[u];
        int vlp=p[v];
        if(ulp==vlp)return;
        else if(r[u]<r[v])p[u]=v;
        else if(r[v]<r[u])p[v]=u;
        else
        {
            p[v]=u;
            r[u]=r[u]+1;
        }
    }
    public int kruskal(ArrayList<Node>l,int n)
    {
        Collections.sort(l,new sortc());
        int r[]=new int[n],p[]=new int[n];
        for(int i=0;i<n;i++)
        {
            r[i]=0;
            p[i]=i;
        }
        int c=0;
        for(Node it:l)
        {
            if(up(it.getU(),p)!=up(it.getV(),p))
            {
                c+=it.getW();
                union(it.getU(),it.getV(),p,r);
            }
        }
        return c;
    }
    public int minCostConnectPoints(int[][] points) {
        ArrayList<Node>l=new ArrayList<>();
        HashMap<String,Integer>h=new HashMap<>();
        for(int i=0;i<points.length;i++)
        {
            String a=Integer.toString(points[i][0])+Integer.toString(points[i][1]);
            h.put(a,i);
        }
        for(int i=0;i<points.length;i++)
        {
            String s=Integer.toString(points[i][0])+Integer.toString(points[i][1]);
            for(int j=i;j<points.length;j++)
            {
                int d=(int)Math.abs(points[i][0]-points[j][0])+(int)Math.abs(points[i][1]-points[j][1]);
                String st=Integer.toString(points[j][0])+Integer.toString(points[j][1]);
                l.add(new Node(h.get(s),h.get(st),d));
            }
        }
        return kruskal(l,points.length);
    }
}