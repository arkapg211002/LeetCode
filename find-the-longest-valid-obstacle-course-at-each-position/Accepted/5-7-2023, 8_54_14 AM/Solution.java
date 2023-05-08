// https://leetcode.com/problems/find-the-longest-valid-obstacle-course-at-each-position

class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int i=-1;
        int current = 0;
        int len = -1;
        int lis[] = new int[obstacles.length];
        int ans[] = new int[obstacles.length];
        for (int j=0;j<obstacles.length;j++) 
        {
            if (i==-1 || lis[i] <= obstacles[j]) 
            {
                lis[++i]=obstacles[j];
                len = i;
            } 
            else 
            {
                len=search(lis, 0, i, obstacles[j]);
                lis[len]=obstacles[j];
            }
            ans[current++]=len+1;
        }
        return ans;      
    }
    public int search(int[] nums, int start, int end, int target) {
        int l=start, r=end;
        int boundary = 0;
        while (l <= r) 
        {
            int mid = l+(r-l)/2;
            if (nums[mid]>target) 
            {
                boundary = mid;
                r = mid - 1;
            } 
            else 
                l = mid + 1;
        }
        return boundary;
    }
}