// https://leetcode.com/problems/the-time-when-the-network-becomes-idle

import java.util.*; 

class Node implements Comparator<Node>
{
    private int v;
    private int weight;
    
    Node(int _v, int _w) { v = _v; weight = _w; }
    
    Node() {}
    
    int getV() { return v; }
    int getWeight() { return weight; }
    
    @Override
    public int compare(Node node1, Node node2) 
    { 
        if (node1.weight < node2.weight) 
            return -1; 
        if (node1.weight > node2.weight) 
            return 1; 
        return 0; 
    } 
}
class Solution {
    public int shortestPath(int s, ArrayList<ArrayList<Node>> adj, int N,int patience[])
    {
        int dist[] = new int[N];
        
        for(int i = 0;i<N;i++) dist[i] = 100000000;
        dist[s] = 0; 
        
        PriorityQueue<Node> pq = new PriorityQueue<Node>(N, new Node());
        pq.add(new Node(s, 0));
        
        while(pq.size() > 0) {
            Node node = pq.poll();
            
            for(Node it: adj.get(node.getV())) {
                if(dist[node.getV()] + it.getWeight() < dist[it.getV()]) {
                    dist[it.getV()] = dist[node.getV()] + it.getWeight(); 
                    pq.add(new Node(it.getV(), dist[it.getV()]));
                }
            }
        }

        int ans = 0;
        for(int x = 1; x < N ; x++) 
        {
            int time = 2*dist[x];
            int p = patience[x];
            int numberOfMessagesSent = (time)/p;
            if(time%p == 0) 
                numberOfMessagesSent--;
            int lastMessage = numberOfMessagesSent*p;
            ans = Math.max(ans,lastMessage+ 2*dist[x]+1);
        }

        return ans;
        
    }
    public int networkBecomesIdle(int[][] edges, int[] patience) {
        int n=patience.length;
        ArrayList<ArrayList<Node>>l=new ArrayList<>();
        for(int i=0;i<n;i++)l.add(new ArrayList<Node>());
        for(int r[]:edges)
        {
            l.get(r[0]).add(new Node(r[1],1));
            l.get(r[1]).add(new Node(r[0],1));
        }
        return shortestPath(0, l, n,patience); 
    }
}