// https://leetcode.com/problems/maximum-average-pass-ratio

class Solution {
        // O(N*logN) time
    // O(N) space
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> doubles = new PriorityQueue<>((o1, o2) -> {
            double t1 = (o1[0] + 1) / (o1[1] + 1) - o1[0] / o1[1];
            double t2 = (o2[0] + 1) / (o2[1] + 1) - o2[0] / o2[1];
            if (t1 == t2) return 0;
            return t1 - t2 > 0 ? -1 : 1;
        });
        for (int[] c : classes) {
            double[] t = new double[3];
            t[0] = c[0];
            t[1] = c[1];
            t[2] = c[0] * 1.0D / c[1];
            doubles.add(t);
        }
        while (extraStudents > 0) {
            extraStudents--;
            double[] t = doubles.poll();
            t[0] += 1;
            t[1] += 1;
            t[2] = t[0] * 1.0D / t[1];
            doubles.add(t);
        }
        double t = 0;
        while (!doubles.isEmpty()) t += doubles.poll()[2];

        return t / classes.length;
    }
}