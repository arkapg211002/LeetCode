// https://leetcode.com/problems/path-in-zigzag-labelled-binary-tree

class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        LinkedList<Integer> res = new LinkedList<>();
        res.add(label);
        int parent  = label;
        while(parent != 1)
        {
            int level = (int) (Math.log(parent) / Math.log(2) );
            parent = fetchParent(parent,level);
            res.addFirst(parent);
        }
        return res;   
    }
    private int fetchParent (int node, int level)
    {
        int supposedParent = node / 2;
        int last = (int) Math.pow(2,level) - 1;
        int first = (int) Math.pow(2,level-1);
       
        int i = first;
        int j = last;

        j = j - (supposedParent - i);

        // while(i!=supposedParent)
        // {
        //     i++;
        //     j--;
        // }
        return j;
    }
}