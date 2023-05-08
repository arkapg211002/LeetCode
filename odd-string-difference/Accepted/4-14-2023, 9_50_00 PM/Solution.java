// https://leetcode.com/problems/odd-string-difference

class Solution {
    public String oddString(String[] words) {
        int n = words[0].length();
        // Taking first 3 arrays for checking the difference
        int[] nums0 = new int[n];
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];

        // Find the difference integer array for first three strings.
        for (int i = 0; i < n - 1; i++) {
            nums0[i] = words[0].charAt(i + 1) - words[0].charAt(i);
            nums1[i] = words[1].charAt(i + 1) - words[1].charAt(i);
            nums2[i] = words[2].charAt(i + 1) - words[2].charAt(i);
        }
        // Check if there is any odd, then we have found the answer and no need of further checking rest of the strings in the array
        if (Arrays.equals(nums0, nums1) && !Arrays.equals(nums0, nums2)) return words[2];
        if (Arrays.equals(nums0, nums2) && !Arrays.equals(nums1, nums2)) return words[1];
        if (Arrays.equals(nums2, nums1) && !Arrays.equals(nums0, nums2)) return words[0];

        // If all above are equal, then it means that the ans is in the remainder of the strings
        // Thus iterating over Strings and find first odd one
        for (int j = 3; j < words.length; j++) {
            int[] temp = new int[n];
            for (int i = 0; i < n - 1; i++) {
                temp[i] = words[j].charAt(i + 1) - words[j].charAt(i);
            }
            if (!Arrays.equals(nums0, temp)) return words[j];
        }
        return words[0];//As it is guaranteed that there is an ans, the code will never reach at this point
        //So, just adding the return statement to complete the code
    }
}