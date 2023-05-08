// https://leetcode.com/problems/power-of-three

class Solution {
public boolean isPowerOfThree(int n) {
double x = Math.log10(n)/Math.log10(3);
return x == (int)x;
}
}