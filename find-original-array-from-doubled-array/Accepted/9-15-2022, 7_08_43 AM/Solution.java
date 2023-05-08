// https://leetcode.com/problems/find-original-array-from-doubled-array

class Solution {
    public int[] findOriginalArray(int[] changed) {
		// a valid array should be of even length
        if (changed.length % 2 != 0) return new int[0]; 
		// initialize and fill the treemap
        TreeMap<Integer, Integer> container = new TreeMap<>();
        for (int num : changed) container.put(num, container.getOrDefault(num, 0) + 1);
        
        int index = 0;
        int[] ans = new int[changed.length / 2];
		// iterate the treemap and fill the original ans array
        for (int key : container.keySet()) {
            if (container.get(key) > 0) {
                if (container.getOrDefault((key << 1), 0) >= container.get(key)) {
                    container.put((key << 1), (container.get((key << 1)) - container.get(key)));
                    for (int i = 0; i < container.get(key); i++) ans[index++] = key;
                } else {
                    return new int[0];
                }
            }
        }
        return ans;
    }
}