// https://leetcode.com/problems/course-schedule-ii

class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
        int n=numCourses;
        ArrayList<ArrayList<Integer>>l=new ArrayList<>();
        List<Integer>d=new ArrayList<>();
        for(int i=0;i<n;i++)l.add(new ArrayList<>());
        for(int r[]:pre)
            l.get(r[1]).add(r[0]);
        for(int i=0;i<n;i++)
        {
            d=new ArrayList<>();
            int v[]=new int[n];
            bfs(i,l,v,d);
            System.out.println(d);
            if(d.size()==n)break;
        }
        if(d.size()!=n)return new int[1];
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
}