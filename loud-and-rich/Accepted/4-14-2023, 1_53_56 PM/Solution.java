// https://leetcode.com/problems/loud-and-rich

class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        ArrayList<ArrayList<Integer>>l=new ArrayList<>();
        for(int i=0;i<quiet.length;i++)
        {
            l.add(new ArrayList<>());
        }
        for(int i=0;i<richer.length;i++)
        {
            l.get(richer[i][1]).add(richer[i][0]);
        }
        ArrayList<Integer>a=new ArrayList<>();
        int ans[]=new int[quiet.length];
        for(int i=0;i<quiet.length;i++)
        {
            a=new ArrayList<>();
            int v[]=new int[quiet.length];
            dfs(i,l,v,a);
            int min=i;
            //System.out.println(i+" "+a);
            
            if(a.isEmpty()==true)
            {
                ans[i]=i;
                continue;
            }
            for(int j=0;j<a.size();j++)
            {
                if(quiet[a.get(j)]<quiet[min])min=a.get(j);
            }
            ans[i]=min;

        }
        return ans;

    }
    public void dfs(int node,ArrayList<ArrayList<Integer>>l,int v[],ArrayList<Integer>a)
    {
        v[node]=1;
        for(Integer it:l.get(node))
        {
            if(v[it]==0)
            {
                a.add(it);
                dfs(it,l,v,a);
            }
        }
    }
}