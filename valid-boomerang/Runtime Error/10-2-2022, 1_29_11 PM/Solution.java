// https://leetcode.com/problems/valid-boomerang

class Solution {
    public boolean isBoomerang(int[][] p) {
        int t=(p[2][1]-p[1][1])/(p[1][0]-p[0][0]);
        int w=(p[1][1]-p[0][1])/(p[2][0]-p[1][0]);
        return (t==w)?false:true;
    }
}