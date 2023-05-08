// https://leetcode.com/problems/minimum-operations-to-reduce-an-integer-to-0

class Solution {
    public int minOperations(int n) {
        int c=0;
        while(n!=0)
        {
            if(n%2==1)
            {
                if((n==1)||(n&2)==0)
                {
                    n -= 1;
                }
                else
                {
                    n += 1;
                }
                c++;
                
            }
            else
            {
                n/=2;
            }
        }
        return c;
    }
}