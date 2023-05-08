// https://leetcode.com/problems/count-nodes-with-the-highest-score

class Solution {
    public int countHighestScoreNodes(int[] parents) 
    {
        int total_nodes=parents.length;
        
        //stores parent node---> child nodes
        Map<Integer,List<Integer>> parent_child=new HashMap<>();
        for(int i=0;i<total_nodes;i++)
        {
            if(!parent_child.containsKey(parents[i]))
            parent_child.put(parents[i],new ArrayList<>());
            
            List<Integer> temp=parent_child.get(parents[i]);
            temp.add(i);
            parent_child.put(parents[i],temp);
        }
        
        
        //count[i]=num of nodes with ith node as a subTree
        int count[]=new int[total_nodes];
        int x=1;
        for(int i=0;i<total_nodes;i++)
        {
            if(count[i]==0)
            x=fill_count_array(i,parent_child,count);
        }
        
        
        long max=0;int ans=0;
        
        for(int i=0;i<total_nodes;i++)
        {
            List<Integer> child=parent_child.get(i);
            long curr=1;
            
            if(child!=null)
            {
              for(int j=0;j<child.size();j++)
              curr=curr*(long)count[child.get(j)];
            }
            
            if(parents[i]!=-1)
            curr=curr*(long)(total_nodes-count[i]);
            
            
            if(curr>max)
            {
                max=curr;
                ans=1;
            }
            
            else if(curr==max)
            ans++;
        }
        
        return ans;
    }
    
    public int fill_count_array(int node,Map<Integer,List<Integer>> map,int count[])
    {
        if(count[node]!=0)
        return count[node];
        
        List<Integer> child=map.get(node);
        int total=1;
        
        if(child==null)
        return count[node]=1;
        
        for(int i=0;i<child.size();i++)
        {
            total+=fill_count_array(child.get(i),map,count);
        }
            
        count[node]=total;
        return total;
    }
}