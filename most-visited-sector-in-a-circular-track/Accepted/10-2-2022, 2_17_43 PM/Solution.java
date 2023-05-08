// https://leetcode.com/problems/most-visited-sector-in-a-circular-track

class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        var start = rounds[0];
        var end = rounds[rounds.length - 1];   
        var res = new ArrayList<Integer>();
        if (start <= end) {
            for (int i = start; i <= end; i++) res.add(i);
        } else {
            for (int i = 1; i <= end; i++) res.add(i);
            for (int i = start; i <= n; i++) res.add(i);
        }
        return res;
    }
}