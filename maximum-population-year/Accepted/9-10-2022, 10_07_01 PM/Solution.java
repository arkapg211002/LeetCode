// https://leetcode.com/problems/maximum-population-year

class Solution {
    public int maximumPopulation(int[][] logs) {

        int[] arr = new int[101];

        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {


                arr[j - 1950]++;

            }
        }
        int maxValue = 0;
        int year = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxValue) {
                maxValue = arr[i];
                year = i + 1950;
            }
        }

        return year;

    }


}