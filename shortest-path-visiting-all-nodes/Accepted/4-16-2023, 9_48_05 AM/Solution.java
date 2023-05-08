// https://leetcode.com/problems/shortest-path-visiting-all-nodes

class Solution {
    public int shortestPathLength(int[][] graph) {
        if(graph.length==1)
            return 0;
        int ansBit = (1 << graph.length) - 1;
        int [][] visitedMap = new int [graph.length][ansBit+1]; 
        Queue<int []> bfsQueue = new LinkedList<>();
        for(int i=0; i<graph.length; i++)
            bfsQueue.add(new int [] {i, 1 << i}); 
        int shortestPath = 0;
        while(!bfsQueue.isEmpty()){
            int size = bfsQueue.size();
            shortestPath++;
            for(int i=0; i<size; i++){
                int [] state = bfsQueue.poll();
                int nodeNum = state[0];
                int visitedNodeBit = state[1];
                for(int neighbors : graph[nodeNum]){
                    int newVisitedNodeBit = visitedNodeBit | (1 << neighbors);
                    if(visitedMap[neighbors][newVisitedNodeBit] == 1) 
                        continue;
                    visitedMap[neighbors][newVisitedNodeBit] = 1;
                    if(newVisitedNodeBit==ansBit)  
                        return shortestPath;
                    bfsQueue.add(new int [] {neighbors, newVisitedNodeBit});
                }   
            }
        }
        return -1;
    }
}