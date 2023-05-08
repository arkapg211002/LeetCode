// https://leetcode.com/problems/boats-to-save-people

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0,r=people.length-1,c=0;
        while(l<=r)
        {
            if(people[l]+people[r]<=limit)
            {
                l+=1;
                r-=1;
            }
            else r-=1;
            c+=1;
        }
        return c;
    }
}