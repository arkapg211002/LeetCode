// https://leetcode.com/problems/advantage-shuffle

class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        // Sort nums2 in descending order
        PriorityQueue<int[]> pq = new PriorityQueue<>((int[] a, int[] b) -> {
            return b[0] - a[0];
        });

        for (int i = 0; i < nums2.length; i++) {
            pq.offer(new int[]{nums2[i], i});
        }

        // Sort num1 in ascending order
        Arrays.sort(nums1);

        int[] res = new int[nums1.length];
        int left = 0, right = nums1.length - 1;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            if (nums1[right] > cur[0]) {
                // nums1 is larger, make it compare to nums2
                res[cur[1]] = nums1[right];
                right--;
            } else {
                // cannot compare to nums2, pick whatever is the smallest
                res[cur[1]] = nums1[left];
                left++;
            }
        }

        return res;
    }
}