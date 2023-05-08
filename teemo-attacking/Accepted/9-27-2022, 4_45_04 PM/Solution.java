// https://leetcode.com/problems/teemo-attacking

class Solution {
    public int findPoisonedDuration(int[] arr, int duration) {
        int count = 0; // at start
        for(int idx = 1; idx < arr.length; idx++,count += duration )
            if(arr[idx-1] + duration >= arr[idx])
                count -= arr[idx-1] + duration - arr[idx]; // decrement count if overlapped by amount of overlapped
        return count + duration; // adding to the last
    } 
}