// https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        ArrayList<ArrayList<Integer>>l=new ArrayList<>();
        for(int i=0;i<n;i++)
            l.add(new ArrayList<>());
        for(int i=0;i<edges.size();i++)
            l.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            a[i][0]=i;
            a[i][1]=bfs(i,l,n);
        }
        Arrays.sort(a,(x,y)->
        {
            if(x[1]>y[1])return -1;
            else if(x[1]<y[1])return 1;
            else return 0;
        });
        int max=a[0][1];
        List<Integer>ans=new ArrayList<>();
        ans.add(a[0][0]);
        for(int i=1;i<n;i++)
        {
            if(a[i][1]!=max)break;
            else ans.add(a[i][0]);
        }
        return ans;
    }
    public int bfs(int node,ArrayList<ArrayList<Integer>>l,int n)
    {
        int v[]=new int[n];
        Queue<Integer>q=new LinkedList<>();
        q.add(node);
        v[node]=1;
        int c=0;
        while(!q.isEmpty())
        {
            Integer m=q.poll();
            for(Integer it:l.get(m))
            {
                if(v[it]==0)
                {
                    c+=1;
                    q.add(it);
                    v[it]=1;
                }
            }
        }
        return c;
    }
}