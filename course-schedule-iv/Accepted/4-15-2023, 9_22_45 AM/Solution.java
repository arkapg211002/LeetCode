// https://leetcode.com/problems/course-schedule-iv

class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        int n=numCourses;
        List<Boolean>b=new ArrayList<>();
        ArrayList<ArrayList<Integer>>l=new ArrayList<>();
        for(int i=0;i<n;i++)l.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++)
            l.get(prerequisites[i][0]).add(prerequisites[i][1]);
        for(int i=0;i<queries.length;i++)
        {
            int v[]=new int[n];
            dfs(queries[i][0],l,v);
            if(v[queries[i][1]]==1)b.add(true);
            else b.add(false);
        }
        return b;
    }
    public void dfs(int node,ArrayList<ArrayList<Integer>>l,int v[])
    {
        v[node]=1;
        for(Integer it:l.get(node))
        {
            if(v[it]==0)
                dfs(it,l,v);
        }
    }
}