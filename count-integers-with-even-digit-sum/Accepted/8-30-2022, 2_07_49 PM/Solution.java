// https://leetcode.com/problems/count-integers-with-even-digit-sum

class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=1;i<=num;i++)
        {
            int s=0;
            int j=i;
            while(j>0)
            {
                s+=j%10;
                j/=10;
            }
            if(s%2==0)c+=1;
        }
        return c;
    }
}