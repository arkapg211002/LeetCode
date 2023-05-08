// https://leetcode.com/problems/number-of-good-paths

class Solution {
    int[] parents, count, vals;
    int res;
    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        this.vals=vals;
        Arrays.sort(edges, (a,b)->Math.max(vals[a[0]], vals[a[1]])-Math.max(vals[b[0]],vals[b[1]])); good paths is equal to the number of nodes
        res = vals.length;
        parents = new int[vals.length];
        for(int i = 0; i < vals.length; i++) parents[i] = i;
        count = new int[vals.length];
        for(int[] edge: edges) union(edge[0], edge[1]);
        return res;
    }
    
    boolean union(int a, int b) {
        int pa = parent(a);
        int pb = parent(b);
        if(pa == pb) return false;
        if(vals[pa] == vals[pb]) {
            res += (count[pa]+1)*(count[pb]+1);
            count[pa] += count[pb]+1;
            parents[pb] = pa;
        }
        else if(vals[pa] > vals[pb]) parents[pb] = pa;
        else parents[pa] = pb;
        return true;
    }
    
    private int parent(int a) {
        int p;
        if((p=parents[a])!=a) p=parents[a]=parent(p);
        return p;
    }
}