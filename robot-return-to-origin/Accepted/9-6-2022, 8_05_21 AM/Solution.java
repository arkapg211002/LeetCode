// https://leetcode.com/problems/robot-return-to-origin

class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char a:moves.toCharArray()){
            if(a=='U')   x++;
            else if(a=='D')  x--;
            else if(a=='L')  y--;
            else y++;
        }
        return x==0&&y==0?true:false;
    }
}