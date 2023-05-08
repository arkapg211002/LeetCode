// https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square

class Solution {
    public int countGoodRectangles(int[][] rectangles) {
     int max=0;
        int count=0;
        for(int i=0;i<rectangles.length;i++){
            int min=Math.min(rectangles[i][0],rectangles[i][1]); 
            if(max<min){
                max=min;
                count=1;
            }
            else if(max==min){
                count++;
            }
            else{
                continue;
            }    
        }
        return count;
    }
}