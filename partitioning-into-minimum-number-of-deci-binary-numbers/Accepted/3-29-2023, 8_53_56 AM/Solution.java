// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers

class Solution {
    public int minPartitions(String n) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n.length();i++)
            l.add(Integer.parseInt(Character.toString(n.charAt(i))));
        return Collections.max(l);
    }
}