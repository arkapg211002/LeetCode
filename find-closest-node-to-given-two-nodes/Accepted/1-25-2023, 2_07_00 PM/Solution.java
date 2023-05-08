// https://leetcode.com/problems/find-closest-node-to-given-two-nodes

class Solution {
    // Function for Depth First Search
    void dfs(int i, boolean[] visited, ArrayList<ArrayList<Integer>> adj, int[] distance_node1, int dist)
    {
        // Marking the node visited
        visited[i]=true;
        // Storing the distance 
        distance_node1[i]=dist;
        // Checking the further nodes
        for (int it: adj.get(i)) if (!visited[it]) dfs(it, visited, adj, distance_node1, dist+1);
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        // Data structure to store Distance of nodes from node1 & node 2
        int[] distance_node1 = new int[edges.length];
        int[] distance_node2 = new int[edges.length];
        Arrays.fill(distance_node1, Integer.MAX_VALUE);
        Arrays.fill(distance_node2, Integer.MAX_VALUE);
        // Visited array to keep a traack of visited nodes
        boolean[] visited = new boolean[edges.length];
        // Declaring Adjacency List
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<edges.length;i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        // Filling Adjacency List
        for (int i=0;i<edges.length;i++)
        {
            // Treating -1 as self loop
            if (edges[i]==-1) adj.get(i).add(i);
            else adj.get(i).add(edges[i]);
        }
        // Calling dfs to fill the distance needed for each node
        dfs(node1, visited, adj, distance_node1, 0);
        // Reset the visited array after first dfs call
        Arrays.fill(visited, false);
        // Calling dfs to fill the distance needed for each node
        dfs(node2, visited, adj, distance_node2, 0);

        int ans=Integer.MAX_VALUE;
        // Keeping track of index
        int ind=-1;
        for (int i=0;i<edges.length;i++)
        {
            // Minimising the maximum distance of node from node1 & node2
            if (ans>Math.max(distance_node1[i],distance_node2[i]))
            {
                ans=Math.max(distance_node1[i],distance_node2[i]);
                ind=i;
            }
        }
        // Return the index
        return ind;
    }
}