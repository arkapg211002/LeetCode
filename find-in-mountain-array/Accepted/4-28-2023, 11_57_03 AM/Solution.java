// https://leetcode.com/problems/find-in-mountain-array

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray a) {
        int l=0;
        int r=a.length()-1;
        int m;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(a.get(m)>a.get(m+1))r=m-1;
            else l=m+1;
        }
        int p=l;
        r=p-1;
        l=0;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(a.get(m)==target)return m;
            else if(a.get(m)>target)r=m-1;
            else l=m+1;
        }
        l=p;
        r=a.length()-1;
        while(l<=r)
        {
            m=l+(r-l)/2;
            if(a.get(m)==target)return m;
            else if(a.get(m)>target)l=m+1;
            else r=m-1;
        }
        return -1;
    }
}