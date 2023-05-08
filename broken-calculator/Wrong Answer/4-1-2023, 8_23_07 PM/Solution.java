// https://leetcode.com/problems/broken-calculator

class Solution {
    public int brokenCalc(int startValue, int target) {
        if(startValue==target)return 0;
        else if(startValue>target)return (startValue-target);
        else
        {
            int c=0;
            while(target>startValue)
            {
                c+=1;
                target/=2;
            }
            return c+(startValue-target);
        }
    }
}