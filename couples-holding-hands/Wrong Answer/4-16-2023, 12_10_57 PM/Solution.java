// https://leetcode.com/problems/couples-holding-hands

class Solution {
    public int minSwapsCouples(int[] row) {
        int c=0;
        for(int i=0;i<row.length;i+=2)
        {
            if(row[i]%2==0 && row[i+1]!=row[i]+1)c+=1;
            else if(row[i]%2!=0 && row[i+1]+1!=row[i])c+=1;
            else continue;
        }
        return c/2;
    }
}