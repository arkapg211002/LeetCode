// https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid

class Node implements Comparator<Node>
{
    int row,col,cost;
    public Node(int row,int col,int cost)
    {
        this.row=row;
        this.col=col;
        this.cost=cost;
    }
    public Node(){}
    int getrow(){return row;}
    int getcol(){return col;}
    int getcost(){return cost;}
    @Override
    public int compare(Node a, Node b)
    {
        if(a.getcost()<b.getcost())return -1;
        else if(a.getcost()>b.getcost())return 1;
        else return 0;
    }
}
class Solution {
    public int minCost(int[][] g) {
        int n=g.length;
        int m=g[0].length;
        int v[][]=new int[n][m];
        int tr=n-1,tc=m-1;
        PriorityQueue<Node>p=new PriorityQueue<>(new Node());
        p.add(new Node(0,0,0));
        while(p.size()>0)
        {
            Node nd=p.poll();
            v[nd.getrow()][nd.getcol()]=1;
            if(nd.getrow()==tr && nd.getcol()==tc)return nd.getcost();
            int r=nd.getrow();
            int c=nd.getcol();
            if(c+1<m && v[r][c+1]==0)
            {
                if(g[r][c]==1)p.add(new Node(r,c+1,nd.getcost()));
                else p.add(new Node(r,c+1,nd.getcost()+1));
            }
            if(c-1>=0 && v[r][c-1]==0)
            {
                if(g[r][c]==2)p.add(new Node(r,c-1,nd.getcost()));
                else p.add(new Node(r,c-1,nd.getcost()+1));
            }
            if(r+1<n && v[r+1][c]==0)
            {
                if(g[r][c]==3)p.add(new Node(r+1,c,nd.getcost()));
                else p.add(new Node(r+1,c,nd.getcost()+1));
            }
            if(r-1>=0 && v[r-1][c]==0)
            {
                if(g[r][c]==4)p.add(new Node(r-1,c,nd.getcost()));
                else p.add(new Node(r-1,c,nd.getcost()+1));
            }
        }
        return 0;
    }
}