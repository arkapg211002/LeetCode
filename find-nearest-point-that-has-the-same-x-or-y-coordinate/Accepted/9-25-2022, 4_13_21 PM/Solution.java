// https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate

class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int flag = -1;
        int temp = 0; 
        int dis = 0;
        int index = -1;
        for(int i= 0; i<points.length;i++){
            if(points[i][0] == x || points[i][1] == y){
                flag = 1; 
                dis = Math.abs(x - points[i][0])+Math.abs(y-points[i][1]);
                System.out.println(dis);
                if(temp == 0 && index == -1){
                    temp = dis;
                    index = i;
                }
                else if(dis<temp){
                    temp = dis;
                    index = i;
                }
                
            }
        }
        if(flag!=-1){
            return index;
        }
        else return flag;
        
    }
}