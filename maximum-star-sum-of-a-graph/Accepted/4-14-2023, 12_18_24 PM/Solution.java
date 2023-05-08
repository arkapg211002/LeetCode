// https://leetcode.com/problems/maximum-star-sum-of-a-graph

class Solution {
    public int maxStarSum(int[] vals, int[][] edges, int k) {
        int n = vals.length;
        List<Integer>[] graph = new List[n];
        
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            graph[a].add(b);
            graph[b].add(a);
        }
        
        long res = Long.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            List<Integer> curr = graph[i];
            
            curr.sort((a, b) -> vals[b]-vals[a]);
            
            long max = vals[i], sum = vals[i];
            
            for (int j = 0; j < k && j < curr.size(); j++) {
                sum += vals[curr.get(j)];
                max = Math.max(max, sum);
            }
            
            res = Math.max(res, max);
        }
        
        return (int) res;
    }
}