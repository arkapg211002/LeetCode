// https://leetcode.com/problems/maximum-number-of-groups-entering-a-competition

class Solution {
    public int maximumGroups(int[] grades) {
        Arrays.sort(grades);
        int sq=(int)Math.sqrt(2*1.0*grades.length);
        int s=sq*(sq+1)/2;
        if(s<=grades.length)return sq;
        else return (sq-1);
    }
}