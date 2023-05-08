// https://leetcode.com/problems/number-of-good-paths

class Solution {
    int[] parents, count, vals;
    int res;
    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        this.vals=vals;
        // Unlike other strategies where we focus on the nodes to select the order of the
        // merging of groups, here we will focus on the edges (paths). Each edge always adds
        // two groups, and sorting them in this order ensures that we will always be merging
        // groups with maximum values from min to max. I.e every group has a max value, so we
        // merge the ones whith smaller to max.
        Arrays.sort(edges, (a,b)->Math.max(vals[a[0]], vals[a[1]])-Math.max(vals[b[0]],vals[b[1]]));
        // Minimum number of good paths is equal to the number of nodes
        res = vals.length;
        // Parent array
        parents = new int[vals.length];
        for(int i = 0; i < vals.length; i++) parents[i] = i;
        // Count array to keep track of number of child nodes with value equal to the parent
        // Note: Also the way we will implement will ensure that the parent is always the
        // biggest value.
        count = new int[vals.length];
        // Processing each edge and connecting adjacent nodes into one component. Please
        // understand first the comment about the sorting.
        for(int[] edge: edges) union(edge[0], edge[1]);
        return res;
    }
    
    // Important: usually here you see the union by rank, but in this case the union is to
    // the parent with biggest value. If they have the same value any of them surfices.
    boolean union(int a, int b) {
        int pa = parent(a);
        int pb = parent(b);
        if(pa == pb) return false;
        //If two adjacent node have same value, they will increase the number of good paths
        // corresponding to the number of nodes in their component
        // We will choose pa as parent, but it could have been pb
        if(vals[pa] == vals[pb]) {
            // the +1 is because every group also has the parent with the max value
            res += (count[pa]+1)*(count[pb]+1);
            count[pa] += count[pb]+1;
            parents[pb] = pa;
        } 
        // If two nodes have different values, join the smaller one to the larger one
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