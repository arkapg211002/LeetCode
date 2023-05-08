// https://leetcode.com/problems/number-of-good-leaf-nodes-pairs

	public int countPairs(TreeNode root, int distance) {
        solve(root, distance);
        return ans;
    }
    int ans = 0;
    //from each node return list of distances to the leaves
    List<Integer> solve(TreeNode root, int distance) {
        if(root == null) return new ArrayList();
        if(root.left == null && root.right == null){
            List<Integer> leaf = new ArrayList();
            leaf.add(1);
            return leaf;
        }
            
        List<Integer> left = solve(root.left, distance);
        List<Integer> right = solve(root.right, distance);
        
        for(int l : left) {
            for(int r : right) {
                if(l + r <= distance) {
                    ans++;
                }
            }
        }
        List<Integer> ret = new ArrayList();
        for(int l : left) {
            if(l + 1 < distance) {
                ret.add(l+1);
            }
        }
        for(int r : right) {
            if(r + 1 < distance) {
                ret.add(r+1);
            }
        }
        return ret;
    }