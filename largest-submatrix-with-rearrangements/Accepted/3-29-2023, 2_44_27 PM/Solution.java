// https://leetcode.com/problems/largest-submatrix-with-rearrangements

class Solution {
    public int largestSubmatrix(int[][] matrix) {
    int area = 0;

    for(int i = 0; i < matrix.length; i++) {
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int j = 0; j < matrix[i].length; j++) {
            if(matrix[i][j] == 1) {
                if(i > 0)
                    matrix[i][j] += matrix[i-1][j];

                map.put(matrix[i][j], map.getOrDefault(matrix[i][j], 0)+1);
            }
        }

        int w = 0;
        for(int key : map.keySet()) {
            w += map.get(key);
            area = Math.max(area, w * key);
        } 

    }

    return area;
}
}