// https://leetcode.com/problems/boats-to-save-people

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l=0,r=1,s=people[l],c=0;
        while(l<people.length && r<people.length)
        {
            s+=people[r];
            if(s<=limit)
            {
                r+=1;
                continue;
            }
            else
            {
                c+=1;
                l=r;
                r+=1;
                s=people[l];
                continue;
            }
        }
        if(l<people.length)c+=1;
        return c;
    }
}