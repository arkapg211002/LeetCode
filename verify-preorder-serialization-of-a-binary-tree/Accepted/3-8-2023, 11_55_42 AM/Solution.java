// https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree

class Solution {
    public boolean isValidSerialization(String preorder) {
    String s = preorder.replaceAll("\\d+,#,#", "#");
    return s.equals("#") || !s.equals(preorder) && isValidSerialization(s);
}
}