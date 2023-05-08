// https://leetcode.com/problems/maximum-product-after-k-increments

class Solution {
	public static int maximumProduct(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		while (k-- > 0) {
			int min = pq.remove();
			min = min + 1;
			pq.add(min);
		}
	    long res = 1;
		while (!pq.isEmpty()) {
			res = res * pq.remove() % 1000000007;
		}
		return (int) (res);
	}
}