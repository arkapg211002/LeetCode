// https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered

class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<ranges.length;i++)
        {
            for(int j=ranges[i][0];j<=ranges[i][1];j++)
            {
                l.add(j);
            }
            
        }
        for(int i=left;i<=right;i++)
        {
            if(l.contains(i)==false)return false;
        }
        return true;
        
    }
}