// https://leetcode.com/problems/earliest-possible-day-of-full-bloom

class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        Pair[] flowerTime = new Pair[n];
        for (int i = 0; i < n; i++) {
            flowerTime[i] = new Pair(plantTime[i], growTime[i]);
        }
        Arrays.sort(flowerTime, (a, b) -> b.growTime - a.growTime);
        int daysPlanted = 0;
        int maxDays = 0;
        for (Pair current : flowerTime) {
            maxDays = Math.max(maxDays, daysPlanted + current.plantTime + current.growTime);
            daysPlanted += current.plantTime;
        }
        return maxDays;
    }

    class Pair {
        public int plantTime;
        public int growTime;

        Pair(int plantTime, int growTime) {
            this.plantTime = plantTime;
            this.growTime = growTime;
        }
    }
}
