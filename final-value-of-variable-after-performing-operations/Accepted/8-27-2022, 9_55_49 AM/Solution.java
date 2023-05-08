// https://leetcode.com/problems/final-value-of-variable-after-performing-operations

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++)
        {
            char ch1=operations[i].charAt(0);
            char ch2=operations[i].charAt(2);
            if(ch1=='+' || ch2=='+')x=x+1;
            else if(ch1=='-' || ch2=='-')x=x-1;
        }
        return x;
    }
}