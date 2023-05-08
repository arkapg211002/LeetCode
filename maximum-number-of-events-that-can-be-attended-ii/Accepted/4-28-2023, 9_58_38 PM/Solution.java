// https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended-ii

class Solution {
    public int maxValue(int[][] events, int k) {
        int max = 0; 
        if (k == 1) 
        {
            for(int [] event : events) 
                max = Math.max(max, event[2]);
            return max;
        }
        Arrays.sort(events, (a,b) -> Integer.compare(a[0], b[0]));
        int size = events.length;
        int[][] cache = new int[size + 1][k + 1];
        for (int i = size - 1; i >= 0; i--) 
        {
            int next = binarySearch(events, events[i][1], i + 1, size);
            for (int j = 1; j <= k; j++) 
                cache[i][j] = Math.max(cache[i + 1][j],cache[next][j - 1] + events[i][2]); 
        }
        return cache[0][k];
    }
    public int binarySearch(int[][] events, int targetEnd, int lo, int hi) 
    {
        while (lo < hi) 
        {
            int mid = (hi - lo) / 2 + lo;
            if (targetEnd >= events[mid][0]) 
                lo = mid + 1;
            else 
                hi = mid;
        }
        return lo;
    }
}