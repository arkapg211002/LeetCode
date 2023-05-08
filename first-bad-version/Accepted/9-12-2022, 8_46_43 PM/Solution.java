// https://leetcode.com/problems/first-bad-version

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=1;
        int e=n;
        while(s<e)
        {
            int m=s+(e-s)/2;
            if(isBadVersion(m))
                e=m;
            else
                s=m+1;
        }
        return e;
    }
}