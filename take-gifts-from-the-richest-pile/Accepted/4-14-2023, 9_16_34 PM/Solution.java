// https://leetcode.com/problems/take-gifts-from-the-richest-pile

class Solution {
    public long pickGifts(int[] gifts, int k) {
        int l = gifts.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for(int i:gifts)                   // Adding the elements to pq
            pq.add(i);
        
        for(int i=1; i<=k; i++)
        {
            int temp = pq.poll();         //Fetching the max element
            int n = (int)Math.sqrt(temp);
            pq.add(n);
        }

        long sum=0;
        for(int i:pq)                     // Iterate over the elements
        {                                 // of pq and add to sum
            sum+=i;
        }
        return sum;
    }
}